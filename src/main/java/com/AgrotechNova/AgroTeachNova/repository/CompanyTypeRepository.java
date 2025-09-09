package com.AgrotechNova.AgroTeachNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AgrotechNova.AgroTeachNova.Company;

public interface CompanyTypeRepository extends JpaRepository<Company,Long> {
	
}
