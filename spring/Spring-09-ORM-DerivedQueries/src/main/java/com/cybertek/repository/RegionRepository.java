package com.cybertek.repository;

import com.cybertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

        //display all region in Canada
    List<Region> findByCountry(String country);

    //display all region in Canada, without duplicates
    List<Region> findDistinctByCountry(String country);

    //display all regions with country name includes 'United'
    List<Region> findAllByCountryContains(String country);

    //display all regions with country name include "United" in order
    List<Region> findAllByCountryContainsOrderByCountry(String country);

    //display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);

}
