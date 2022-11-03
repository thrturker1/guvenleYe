package com.guvenleye.guvenleYe.service.abstracts;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Manager;

public interface ManagerService {
	
	public List<Manager> getAllManager();
	
	public Manager getOneManager(int id);
	
	public Manager postOneManager(Manager manager);
	
	public Manager putOneManager(int id, Manager manager);

	public void deleteOneManager(int id);
}
