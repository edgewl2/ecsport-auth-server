package dev.edgeahz.ec.sports.authserver.api.rest.controller;

import dev.edgeahz.ec.sports.authserver.api.rest.DiscoveryApi;
import dev.edgeahz.ec.sports.authserver.api.rest.dto.GetJwks200Response;
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
