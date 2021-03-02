package com.ilatest.demoapi.crud.repository;

import com.ilatest.demoapi.crud.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldCountryRepository extends JpaRepository<Country, Long> {
}

