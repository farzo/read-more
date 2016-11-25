package com.reader.app.service;

/**
 * Created by fmoghaddam on 23.11.2016.
 */
public interface SecurityService {

    String findLoggedInUsername();
    void autologin(String username, String password);

}
