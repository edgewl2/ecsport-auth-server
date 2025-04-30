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
public class AuthorizationRequest {
    private String id;
    private String clientId;
    private String responseType;
    private String redirectUri;
    private Set<String> scopes;
    private String state;
    private String nonce;
    private String codeChallenge;
    private String codeChallengeMethod;
    private String userId;
    private Instant createdAt;
    private Instant expiresAt;
    private boolean approved;
}
