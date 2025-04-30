package dev.edgeahz.ec.sports.authserver.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "oauth.client.defaults")
public class OAuthClientDefaults {
    private List<String> grantTypes;
    private List<String> responseTypes;
    private String tokenEndpointAuthMethod;
    private String idTokenSignedResponseAlg;
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;

    public Set<String> getGrantTypesAsSet() {
        return grantTypes != null ? Set.copyOf(grantTypes) : Set.of();
    }

    public Set<String> getResponseTypesAsSet() {
        return responseTypes != null ? Set.copyOf(responseTypes) : Set.of();
    }
}
