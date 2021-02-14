package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Center;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends CrudRepository<Center, Long> {
    @Query("select * from CENTROS where ID = :id")
    Center findCenterById(@Param("id") Long id);
}
