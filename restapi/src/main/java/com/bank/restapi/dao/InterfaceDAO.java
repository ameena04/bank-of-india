package com.bank.restapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.bank.restapi.model.Banks;

@Transactional
public interface InterfaceDAO extends CrudRepository<Banks, Long>{
	public Banks findByIfsc(String ifsc);
	public List<Banks> findBybankNameAndCity(String name, String city);
}
