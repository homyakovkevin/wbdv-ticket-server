package com.example.wbdvticketprojectserver.repositories;

import com.example.wbdvticketprojectserver.models.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository
        extends CrudRepository<User, Integer> {
    @Query("SELECT user from User user WHERE user.username=:username AND user.password=:password")
    User findUserByCredentials
            (@Param("username") String username,
             @Param("password") String password);

    @Query("SELECT user from User user WHERE user.username=:username")
    User findUserByUsername(@Param("username") String username);

    @Query("select user from User user")
    List<User> findAllUsers();

}
