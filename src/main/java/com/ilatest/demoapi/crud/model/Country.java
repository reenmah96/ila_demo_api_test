package com.ilatest.demoapi.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "world_countries")
public class Country {
    private Long world_country_id;
    private String country_name;
    private String country_dial_code;
    private String iso_code2;
    private String iso_code3;
    private Integer city_id;

    public Country() {

    }

    public Country(String country_name, String country_dial_code, String iso_code2,
                   String iso_code3, Integer city_id) {
        this.country_name = country_name;
        this.country_dial_code = country_dial_code;
        this.iso_code2 = iso_code2;
        this.iso_code3 = iso_code3;
        this.city_id = city_id;
    }

    @Id
    @Column(name = "world_country_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getWorld_country_id() {
        return world_country_id;
    }

    public void setWorld_country_id(Long world_country_id) {
        this.world_country_id = world_country_id;
    }

    @Column(name = "country_name", nullable = false)
    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Column(name = "country_dial_code", nullable = false)
    public String getCountry_dial_code() {
        return country_dial_code;
    }

    public void setCountry_dial_code(String country_dial_code) {
        this.country_dial_code = country_dial_code;
    }

    @Column(name = "iso_code2", nullable = false)
    public String getIso_code2() {
        return iso_code2;
    }

    public void setIso_code2(String iso_code2) {
        this.iso_code2 = iso_code2;
    }

    @Column(name = "iso_code3", nullable = false)
    public String getIso_code3() {
        return iso_code3;
    }

    public void setIso_code3(String iso_code3) {
        this.iso_code3 = iso_code3;
    }

    @Column(name = "city_id", nullable = false)
    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "Country [world_country_id=" + world_country_id + ", country_name=" + country_name + "," +
                " country_dial_code=" + country_dial_code + ", iso_code2=" + iso_code2
                + ", city_id=" + city_id + "]";
    }

}
