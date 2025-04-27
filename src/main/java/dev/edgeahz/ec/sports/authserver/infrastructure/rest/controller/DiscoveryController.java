package dev.edgeahz.ec.sports.authserver.infrastructure.rest.controller;

import dev.edgeahz.ec.sports.authserver.infrastructure.rest.api.DiscoveryApi;
import dev.edgeahz.ec.sports.authserver.infrastructure.rest.model.GetJwks200Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DiscoveryController implements DiscoveryApi {

    @Override
    public ResponseEntity<GetJwks200Response> getJwks() {
        return ResponseEntity.ok(new GetJwks200Response());
    }
}
