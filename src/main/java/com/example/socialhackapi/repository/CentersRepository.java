package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Centers;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentersRepository extends CrudRepository<Centers, Long> {
    @Query("select * from CENTROS")
    List<Centers> findByUsername();
}
