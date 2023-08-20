package com.employee.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
