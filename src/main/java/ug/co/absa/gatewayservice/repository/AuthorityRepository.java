package ug.co.absa.gatewayservice.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import ug.co.absa.gatewayservice.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
