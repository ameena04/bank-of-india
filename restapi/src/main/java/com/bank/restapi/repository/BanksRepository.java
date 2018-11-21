package com.bank.restapi.repository;

import com.bank.restapi.model.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanksRepository extends JpaRepository<Banks, Long> {
	Banks findByIfsc(String ifsc);
}


