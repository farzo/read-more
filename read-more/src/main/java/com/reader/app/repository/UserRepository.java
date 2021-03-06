package com.reader.app.repository;

import com.reader.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fmoghaddam on 23.11.2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
