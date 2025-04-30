package dev.edgeahz.ec.sports.authserver.infrastructure.persistence.repository;

import dev.edgeahz.ec.sports.authserver.infrastructure.persistence.entity.OAuthClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OAuthClientJpaRepository extends JpaRepository<OAuthClientEntity, Long> {
    Optional<OAuthClientEntity> findByClientId(String clientId);
    List<OAuthClientEntity> findByActiveTrue();
}
