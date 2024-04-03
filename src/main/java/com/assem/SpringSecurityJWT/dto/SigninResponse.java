package com.assem.SpringSecurityJWT.dto;

import lombok.Data;

@Data
public class SigninResponse {
    private int statusCode;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String error;
}
