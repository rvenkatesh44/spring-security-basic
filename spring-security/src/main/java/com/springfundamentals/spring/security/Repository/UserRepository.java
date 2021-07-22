package com.springfundamentals.spring.security.Repository;

import com.springfundamentals.spring.security.entity.SecUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SecUser,Long> {

    SecUser findByUsername(String userName);
}
