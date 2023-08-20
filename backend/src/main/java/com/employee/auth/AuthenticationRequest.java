package com.employee.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
