package com.univlittoral.philippe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.philippe.entity.LivreEntity;
import com.univlittoral.philippe.enums.TypeEnum;


@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Long> {
	@Query(value = "SELECT p from LivreEntity p where genre = :genre")
	List<LivreEntity> findByType(@Param("genre") final TypeEnum genre);
}
