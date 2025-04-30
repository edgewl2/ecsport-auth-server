package dev.edgeahz.ec.sports.authserver.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OAuthClient {
    private Long id;
    private String clientId;
    private String clientSecret;
    private String clientName;
    private String description;
    private String clientUri;
    private Set<String> redirectUris;
    private Set<String> postLogoutRedirectUris;
    private Set<String> grantTypes;
    private Set<String> responseTypes;
    private Set<String> scopes;
    private String tokenEndpointAuthMethod;
    private String idTokenSignedResponseAlg;
    private String logoUri;
    private Set<String> contacts;
    private Instant clientIdIssuedAt;
    private Instant clientSecretExpiresAt;
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;
    private boolean active;
    private String createdBy;
    private Instant createdAt;
    private String updatedBy;
    private Instant updatedAt;
}
