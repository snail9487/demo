package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	//@: annotation
	@Autowired	
	private MenuDao menuDao;
	
	@Override
	public Menu addMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if(menuDao.existsById(menu.getName())) {
			return null;
		}
		return menuDao.save(menu);
	}

	@Override
	public List<Menu> addMenus(List<Menu> menus) {
		for(Menu item : menus) {
			if(!StringUtils.hasText(item.getName()) || item.getPrice() <= 0) {
				return null;
			}
		}
		return menuDao.saveAll(menus);
	}

	@Override
	public Menu updateMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if(menuDao.existsById(menu.getName())) {
			return menuDao.save(menu);
		}
		return null;
	}

	@Override
	public Menu findByName(String name) {
		Optional<Menu> op = menuDao.findById(name);
		//�T����
		return op.isEmpty() ? null : op.get();
	}

	@Override
	public List<Menu> findAll() {
		return menuDao.findAll();
	}
	
	
}
