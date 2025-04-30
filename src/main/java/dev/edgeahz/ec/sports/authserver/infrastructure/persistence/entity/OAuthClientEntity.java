package dev.edgeahz.ec.sports.authserver.infrastructure.persistence.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "oauth_client")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuthClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id", unique = true, nullable = false)
    private String clientId;

    @Column(name = "client_secret")
    private String clientSecret;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "client_uri")
    private String clientUri;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_redirect_uri", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "redirect_uri")
    private Set<String> redirectUris;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_post_logout_redirect_uri", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "post_logout_redirect_uri")
    private Set<String> postLogoutRedirectUris;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_grant_type", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "grant_type")
    private Set<String> grantTypes;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_response_type", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "response_type")
    private Set<String> responseTypes;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_scope", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "scope")
    private Set<String> scopes;

    @Column(name = "token_endpoint_auth_method")
    private String tokenEndpointAuthMethod;

    @Column(name = "id_token_signed_response_alg")
    private String idTokenSignedResponseAlg;

    @Column(name = "logo_uri")
    private String logoUri;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "oauth_client_contact", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "contact")
    private Set<String> contacts;

    @Column(name = "client_id_issued_at", nullable = false)
    private Instant clientIdIssuedAt;

    @Column(name = "client_secret_expires_at")
    private Instant clientSecretExpiresAt;

    @Column(name = "access_token_validity_seconds")
    private Integer accessTokenValiditySeconds;

    @Column(name = "refresh_token_validity_seconds")
    private Integer refreshTokenValiditySeconds;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
