package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Donations;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationsRepository extends CrudRepository<Donations, Long> {
    @Query("select * from CENTROS")
    List<Donations> findByUsername();
}
