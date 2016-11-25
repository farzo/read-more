package com.reader.app.repository;

import com.reader.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fmoghaddam on 23.11.2016.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
