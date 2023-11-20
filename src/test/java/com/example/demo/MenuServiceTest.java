package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

@SpringBootTest
public class MenuServiceTest {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private MenuDao menuDao;
	
	
	@Test
	public void addMenuTest() {
//		MenuService menuService = new MenuServiceImpl();
		//name 不符
		Menu result = menuService.addMenu(new Menu("",120));
		Assert.isTrue(result == null, "addMenu error!");
		//price = 0
		result = menuService.addMenu(new Menu("chicken",0));
		Assert.isTrue(result == null, "addMenu error!");
		//正常新增
		result = menuService.addMenu(new Menu("fish",120));
		Assert.isTrue(result != null, "addMenu error!");
		//新增已存在的menu
		result = menuService.addMenu(new Menu("fish",150));
		Assert.isTrue(result == null, "addMenu error!");
		//刪除測試資料
		menuDao.deleteById("fish");
	}
	
	@Test
	public void updateMenuTest() {
		//name empty
		Menu result = menuService.updateMenu(new Menu("",100));
		Assert.isTrue(result==null,"updateMenu error!");
		//price = 0
		result = menuService.updateMenu(new Menu("chicken",0));
		Assert.isTrue(result==null,"updateMenu error!");
		//update no existed
		result = menuService.updateMenu(new Menu("chicken",100));
		Assert.isTrue(result==null,"updateMenu error!");
		//update 
		menuService.addMenu(new Menu("cake",100));
		result = menuService.updateMenu(new Menu("cake",88));
		Assert.isTrue(result.getPrice() == 88,"updateMenu error!");
		//delete test data
		menuDao.deleteById("cake");
	}

	@Test
	public void findByNameTest() {
		//name error
		Menu result = menuService.findByName("");
		Assert.isTrue(result == null,"findByName error");
		//name no existed
		result = menuService.findByName("test");
		Assert.isTrue(result == null,"findByName error");
		//new test data
		result = menuService.addMenu(new Menu("cake",100));
		result = menuService.findByName("cake");
		Assert.isTrue(result != null,"findByName error");
		//delete test data
		menuDao.deleteById("cake");
		
	}
}
