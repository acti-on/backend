package actiOn.auth.refreshToken.service;


import actiOn.auth.refreshToken.entity.RefreshToken;
import actiOn.auth.refreshToken.repository.RefreshTokenRepository;
import actiOn.exception.BusinessLogicException;
import actiOn.exception.ExceptionCode;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RefreshTokenService {
    RefreshTokenRepository refreshTokenRepository;

    public void refreshTokenRegistration(RefreshToken refreshToken) {
        refreshTokenRepository.save(refreshToken);
    }

    public void verifyRefreshToken(String email, String refreshToken) {
        if (refreshTokenRepository.findByEmailAndRefreshToken(email, refreshToken).isEmpty()){
            throw new BusinessLogicException(ExceptionCode.REFRESH_TOKEN_NOT_FOUND);
        }
    }

    public void clearRefreshTokens(String email) {
        refreshTokenRepository.deleteByEmail(email);
    }
}
