package com.bca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bca.entity.Studententity;

@Repository
public interface Studentrepository extends JpaRepository<Studententity,Long>{

}