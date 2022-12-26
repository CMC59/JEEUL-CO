package com.univlittoral.philippe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.philippe.entity.AuteurEntity;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long> {
	
}
