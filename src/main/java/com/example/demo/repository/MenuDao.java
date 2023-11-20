package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, String>{
	
	

}
	
//	1 建資料表
//	2 entity (跟資料庫的媒介
//	3 DAO