package dev.edgeahz.ec.sports.authserver.application.port.input;

import dev.edgeahz.ec.sports.authserver.domain.model.OAuthClient;

import java.util.List;
import java.util.Optional;

public interface OAuthClientService {
    OAuthClient registerClient(OAuthClient client);
    Optional<OAuthClient> findByClientId(String clientId);
    List<OAuthClient> findAllActiveClients();
    OAuthClient updateClient(String clientId, OAuthClient client);
    void deleteClient(String clientId);
    boolean validateClientCredentials(String clientId, String clientSecret);
    void deactivateClient(String clientId);
    void activateClient(String clientId);
}
