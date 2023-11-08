package com.veera.dairy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.veera.dairy.Entities.Entry;

public interface EntityRepository extends JpaRepository<Entry, Integer> {
	@Query(value="select *from entries where userid=:id",nativeQuery = true)
	public List<Entry>findByUserId(int id);

}
