package com.charan6700.userservice.enums;

import lombok.Getter;

@Getter
public enum Role {
    CUSTOMER("customer"),
    ADMIN("admin");

    private String value;
    Role(String value) {
        this.value = value;
    }
}
