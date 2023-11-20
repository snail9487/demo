package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@SpringBootTest
public class PersonInfoServiceTest {

	@Autowired
	private PersonInfoService personInfoService;
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Test
	public void addInfoTest() {
		personInfoService.addInfo(new PersonInfo(null,"9487",87,"878"));
	}
	
	@Test
	public void addInfoTest1() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("c111111311","bAA",20,"tainan"));
		list.add(new PersonInfo("c222222322","bBB",20,"tainan"));
		personInfoService.addInfoList(list);
	}
	
	@Test
	public void daoSaveAllTest() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("A123456787","AA",20,"tainan"));
		list.add(new PersonInfo("A123456777","BB",20,"tainan"));
		personInfoDao.saveAll(list);
	}
	
	@Test
	public void daoFindTest() {
		Optional<PersonInfo> infoOp = personInfoDao.findById("A123456787");
		if(infoOp.isEmpty()) {
			System.out.println("Not found!!");
		}else {
			System.out.println(infoOp.get().getName());
		}
	}
	
	@Test
	public void daoFindTest1() {
		List<PersonInfo> list = personInfoDao.findAll();
		for(PersonInfo item : list) {
			System.out.println(item.getName());
		}
	}
	
	@Test
	public void daoFindTest2() {
		boolean result = personInfoDao.existsById("A123456787");
		System.out.println(result);
	}
	
	@Test
	public void daoFindTest3() {
		List<PersonInfo> result = personInfoDao.findByCity("tainan");
		for(PersonInfo item : result) {
			System.out.println(item.getName());
		}
	}
}
