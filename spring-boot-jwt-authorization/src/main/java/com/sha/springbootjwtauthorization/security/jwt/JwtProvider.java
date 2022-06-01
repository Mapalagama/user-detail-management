package com.sha.springbootjwtauthorization.security.jwt;

import com.sha.springbootjwtauthorization.security.UserPrinciple;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication (HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
