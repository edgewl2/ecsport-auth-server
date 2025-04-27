package dev.edgeahz.ec.sports.authserver.api.rest.controller;

import dev.edgeahz.ec.sports.authserver.api.rest.ClientsApi;
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
