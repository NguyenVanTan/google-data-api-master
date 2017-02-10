package com.spring.boot.google.sheet.service;


public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
