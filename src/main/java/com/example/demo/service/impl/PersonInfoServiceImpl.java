package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Override
	public void addInfo(PersonInfo personInfo) {
		String pattern = "[a-zA-Z][12][0-9]{8}";
		if(personInfo.getId()!=null && personInfo.getId().matches(pattern)) {
			personInfoDao.save(personInfo);
		}else {
			System.out.println("ID®æ¦¡¤£²Å");
		}
	}
	
	@Override
	public List<PersonInfo> addInfoList(List<PersonInfo> infoList) {
		String pattern = "[a-zA-Z][12][0-9]{8}";
		for(PersonInfo item : infoList) {
			String id = item.getId();
			if(!StringUtils.hasText(id) || !id.matches(pattern)) {
				System.out.println("id error");
				return null;
			}
			if(personInfoDao.existsById(id)) {
				return null;
			}
		}
		return personInfoDao.saveAll(infoList);
	}

	@Override
	public List<PersonInfo> getAllPersonInfo() {
		return personInfoDao.findAll();
	}

	@Override
	public PersonInfo getInfoById(String id) {
		Optional<PersonInfo> op = personInfoDao.findById(id);
		return op.isEmpty() ? null : op.get();
	}

	@Override
	public List<PersonInfo> findAllByAgeGreaterThan(int age) {
		return personInfoDao.findByAgeGreaterThan(age);
	}

	@Override
	public List<PersonInfo> findByAgeLessThanEqualOrderByAge(int age) {
		return personInfoDao.findByAgeLessThanEqualOrderByAge(age);
	}

	@Override
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age1, int age2) {
//		return null;
		return personInfoDao.findByAgeLessThanOrAgeGreaterThan(age1 , age2);
	}

	@Override
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2) {
		return personInfoDao.findTop3ByAgeBetweenOrderByAgeDesc(age1, age2);
	}

	@Override
	public List<PersonInfo> findByCityContaining(String str) {
		return personInfoDao.findByCityContaining(str);
	}

	@Override
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String str) {
		return personInfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(age, str);
	}
	
	
}
