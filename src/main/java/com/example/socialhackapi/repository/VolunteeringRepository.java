package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Volunteering;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteeringRepository extends CrudRepository<Volunteering, Long> {

    @Query("select * from voluntariado where " +
            "(LOCALIDAD = :locality or '' = :locality) and" +
            "(ID_CENTROS = :centerId or '' = :centerId) and" +
            "(DURACION = :duration or '' = :duration) and" +
            "(URGENCIA = :urgency or '' = :urgency)")
    List<Volunteering> findAndFilterAllVolunteering(@Param("urgency") String urgency,
                                             @Param("duration") String duration,
                                             @Param("locality") String locality,
                                             @Param("centerId") String centerId);
}
