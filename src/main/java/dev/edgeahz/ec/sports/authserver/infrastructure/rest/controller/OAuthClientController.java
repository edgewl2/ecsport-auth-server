package dev.edgeahz.ec.sports.authserver.infrastructure.rest.controller;

import dev.edgeahz.ec.sports.authserver.infrastructure.rest.api.ClientsApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OAuthClientController implements ClientsApi {

    public ResponseEntity<Void> activateClient(String clientId) {
        return ResponseEntity.ok().build();
    }
}
