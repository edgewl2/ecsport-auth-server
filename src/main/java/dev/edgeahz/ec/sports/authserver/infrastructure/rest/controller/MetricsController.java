package dev.edgeahz.ec.sports.authserver.infrastructure.rest.controller;

import dev.edgeahz.ec.sports.authserver.infrastructure.rest.api.ManagementApi;
import dev.edgeahz.ec.sports.authserver.infrastructure.rest.model.HealthStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MetricsController implements ManagementApi {

    @Override
    public ResponseEntity<HealthStatus> getHealthStatus() {
        return ResponseEntity.ok(new HealthStatus());
    }
}
