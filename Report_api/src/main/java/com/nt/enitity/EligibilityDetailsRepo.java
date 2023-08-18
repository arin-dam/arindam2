package com.nt.enitity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetailsRepo, Integer> {

	List<String> findplanStaus();

}
