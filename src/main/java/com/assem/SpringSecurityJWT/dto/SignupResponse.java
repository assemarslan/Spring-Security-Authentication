package com.assem.SpringSecurityJWT.dto;

import com.assem.SpringSecurityJWT.entity.OurUsers;
import lombok.Data;

@Data
public class SignupResponse {
    private Integer statusCode;
    private String message;
    private OurUsers ourUsers;
    private String error;

}
