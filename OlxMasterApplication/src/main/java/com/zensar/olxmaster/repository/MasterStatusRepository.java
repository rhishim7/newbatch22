package com.zensar.olxmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olxmaster.entity.Status;

public interface MasterStatusRepository extends JpaRepository<Status, Integer>{

}
