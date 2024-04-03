package com.assem.SpringSecurityJWT.dto;

import lombok.Data;

@Data
public class RefreshTokenResponse {
    private int statusCode;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
}
