package com.guvenleye.guvenleYe.service;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Manager;
import com.guvenleye.guvenleYe.repositories.ManagerRepository;
import com.guvenleye.guvenleYe.service.abstracts.ManagerService;

public class ManagerServiceImp implements ManagerService{

	public final ManagerRepository managerRepository = null;
	@Override
	public List<Manager> getAllManager() {
		List<Manager> list = managerRepository.findAll();
		return list;
	}

	@Override
	public Manager getOneManager(int id) {
		Manager manager = managerRepository.findById(id).orElseThrow();
		return manager;
	}

	@Override
	public Manager postOneManager(Manager manager) {
		return managerRepository.save(manager);
	}

	@Override
	public Manager putOneManager(int id, Manager manager) {
		getOneManager(id);
		manager.setManagerID(id);
		return managerRepository.save(manager);
	}

	@Override
	public void deleteOneManager(int id) {
		getOneManager(id);
		managerRepository.deleteById(id);
		
	}

}
