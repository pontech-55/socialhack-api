package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select PASSWORD from usuarios where ID = :id")
    String findPasswordById(@Param("id") Long id);

    @Query("select ISENTITY, NOME from usuarios where EMAIL = :email and PASSWORD = :hashedPassword")
    Optional<User> findByEmailAndPassword(@Param("email") String email, @Param("hashedPassword") String hashedPassword);

    @Query("select ISENTITY, NOME from usuarios where EMAIL = :email or NOME = :username")
    Optional<User> findByEmailOrUsername(@Param("email") String email, @Param("username") String username);
}
