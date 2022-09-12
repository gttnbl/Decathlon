package com.decathlon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.decathlon.model.Recrue;

public interface RecrueRepository extends JpaRepository<Recrue, Long> {

	@Query(value = " select * from recrue r " + "            join recrue_sports rs "
			+ "               on r.id = rs.recrue_id " + "            join sports s "
			+ "               on s.id = rs.sports_id " + "            where s.nom = ?1", nativeQuery = true)
	List<Recrue> findAllBySports(String sport);

	@Query(value = "SELECT u.* FROM RECRUE u WHERE u.filiere = ?1", nativeQuery = true)
	List<Recrue> findByFiliere(String filiere);

	@Query(value = "SELECT u.* FROM RECRUE u WHERE u.LEADER_NAME = ?1", nativeQuery = true)
	List<Recrue> findByLeader(String leader);
}
