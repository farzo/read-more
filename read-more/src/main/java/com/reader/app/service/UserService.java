package com.reader.app.service;

import com.reader.app.model.User;

/**
 * Created by fmoghaddam on 23.11.2016.
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
