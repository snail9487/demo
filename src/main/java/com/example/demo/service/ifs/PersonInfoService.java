package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.PersonInfo;

public interface PersonInfoService {
	
	public void addInfo(PersonInfo info);
	
	//1
	public List<PersonInfo> addInfoList(List<PersonInfo> infoList);
	
	//2
	public List<PersonInfo> getAllPersonInfo();
	
	//3
	public PersonInfo getInfoById(String id);
	
	//4
	public List<PersonInfo> findAllByAgeGreaterThan(int age);
	
	//5
	public List<PersonInfo> findByAgeLessThanEqualOrderByAge(int age);
	
	//6
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age1, int age2);
	
	//7
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2);
	
	//8
	public List<PersonInfo> findByCityContaining(String str);
	
	//9
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String str);
	
	
}
