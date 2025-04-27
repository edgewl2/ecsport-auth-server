package dev.edgeahz.ec.sports.authserver.infrastructure.rest.controller;

import dev.edgeahz.ec.sports.authserver.infrastructure.rest.api.AuthenticationApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class AuthenticationController implements AuthenticationApi {

    @Override
    public ResponseEntity<Void> authorize(String responseType, String clientId, URI redirectUri, String scope, String state, String codeChallenge, String codeChallengeMethod) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
