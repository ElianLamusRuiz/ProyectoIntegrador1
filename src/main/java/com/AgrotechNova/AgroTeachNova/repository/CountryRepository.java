package com.AgrotechNova.AgroTeachNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AgrotechNova.AgroTeachNova.Country;

public interface CountryRepository extends JpaRepository<Country,Long> {
	
}
