package dev.edgeahz.ec.sports.authserver.application.port.output;

import dev.edgeahz.ec.sports.authserver.domain.model.OAuthClient;

import java.util.List;
import java.util.Optional;

public interface OAuthClientRepository {
    OAuthClient save(OAuthClient client);
    Optional<OAuthClient> findByClientId(String clientId);
    List<OAuthClient> findAllActive();
    void delete(OAuthClient client);
}
