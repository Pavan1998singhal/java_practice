package com.crudwithjpa.apiwithjpa.repository;

import com.crudwithjpa.apiwithjpa.model.wcMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wcMasterRepository extends JpaRepository<wcMaster, Integer> {

}
