package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Users;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthenticationRepository extends CrudRepository<Users, Long> {

    @Query("select email from user where username=:username")
    List<Users> findByUsername(@Param("username") String firstName);

    @Modifying
    @Query("UPDATE user SET email = :email WHERE username = :username")
    boolean updateByUsername(@Param("username") Long id, @Param("email") String name);
}
