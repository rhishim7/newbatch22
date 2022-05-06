package com.zensar.stockapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.stockapplication.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {


}
