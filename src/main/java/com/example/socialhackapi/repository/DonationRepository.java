package com.example.socialhackapi.repository;

import com.example.socialhackapi.model.Donation;
import com.example.socialhackapi.model.Volunteering;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {

    @Query("select * from donaciones where " +
            "(LOCALIDAD = :locality or '' = :locality) and" +
            "(ID_CENTROS = :centerId or '' = :centerId) and" +
            "(ITEM = :item or '' = :item) and" +
            "(URGENCIA = :urgency or '' = :urgency)")
    List<Donation> findAndFilterAllDonations(@Param("urgency") String urgency,
                                                    @Param("item") String item,
                                                    @Param("locality") String locality,
                                                    @Param("centerId") String centerId);
}
