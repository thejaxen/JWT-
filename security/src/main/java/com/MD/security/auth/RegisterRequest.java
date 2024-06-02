package com.MD.security.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {

    private String username;
    private String email;
    private String password;

}
