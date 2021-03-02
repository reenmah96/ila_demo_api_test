package com.ilatest.demoapi.crud.repository;

import com.ilatest.demoapi.crud.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, String> {
    @Query("SELECT u FROM Country u WHERE u.country_name = ?1")

    Country findCountryByName(String country_name);
}