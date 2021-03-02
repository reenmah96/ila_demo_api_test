package com.ilatest.demoapi.crud.controller;

import com.ilatest.demoapi.crud.exception.ResourceNotFoundException;
import com.ilatest.demoapi.crud.model.Country;
import com.ilatest.demoapi.crud.repository.CountryRepo;
import com.ilatest.demoapi.crud.repository.WorldCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WorldCountryController {
    @Autowired
    private WorldCountryRepository repository;

    @Autowired
    private CountryRepo countryRepo;

    @GetMapping("/world_countries")
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @PostMapping("/world_countries")
    public Country postCountry(@RequestBody Country country) {
        return repository.save(country);
    }

    @GetMapping("/world_countries/{country_name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable(value = "country_name")
                                                            String country_name){

        Country country = countryRepo.findCountryByName(country_name);
        return ResponseEntity.ok().body(country);
    }
}