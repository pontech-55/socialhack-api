package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Volunteering;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteeringRepository extends CrudRepository<Volunteering, Long> {
    @Query("select * from CENTROS")
    List<Volunteering> findByUsername();
}
