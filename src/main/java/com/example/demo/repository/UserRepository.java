package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * {@link User} {@link UserRepository}
 */
@Repository
public class UserRepository {

    /**
     *
     * @param user
     * @return bolean
     */
    public boolean saveUser(User user){
        return false;
    }
}
