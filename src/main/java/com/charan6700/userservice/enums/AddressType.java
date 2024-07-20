package com.charan6700.userservice.enums;

public enum AddressType {
    HOME("home"),
    WORK("work"),
    OTHER("other");

    private String value;

    AddressType(String value) {
        this.value = value;
    }
}