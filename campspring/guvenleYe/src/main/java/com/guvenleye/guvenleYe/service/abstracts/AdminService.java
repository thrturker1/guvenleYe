package com.guvenleye.guvenleYe.service.abstracts;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Admin;

public interface AdminService {

	public List<Admin> getAllAdmins();
	
	public Admin getOneAdmin(int id);
	
	public Admin postOneAdmin(Admin admin);
	
	public Admin putOneAdmin(int id,Admin admin);
	
	public void deleteOneAdmin(int id);
}
