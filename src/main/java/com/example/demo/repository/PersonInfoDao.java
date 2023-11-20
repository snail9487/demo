package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String>{

	public List<PersonInfo> findByCity(String city);
	
	public List<PersonInfo> findByNameAndCity(String name, String city);
	
	public List<PersonInfo> findByNameOrCity(String name, String city);
	
	//4
	public List<PersonInfo> findByAgeGreaterThan(int age);
	
	//5
	public List<PersonInfo> findByAgeLessThanEqualOrderByAge(int age);
	
	//6
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age1,int age2);
	
	//7
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2);

	//8
	public List<PersonInfo> findByCityContaining(String str);
	
	//9
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String str);
	
}
