package actiOn.auth.refreshToken.repository;


import actiOn.auth.refreshToken.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByEmailAndRefreshToken(String email, String refreshToken);

    void deleteByEmail(String email);
}
