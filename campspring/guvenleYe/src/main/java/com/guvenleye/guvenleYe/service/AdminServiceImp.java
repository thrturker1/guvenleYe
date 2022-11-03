package com.guvenleye.guvenleYe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guvenleye.guvenleYe.entities.Admin;
import com.guvenleye.guvenleYe.repositories.AdminRepository;
import com.guvenleye.guvenleYe.service.abstracts.AdminService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImp implements AdminService{
	
	private final AdminRepository adminRepository = null;

	@Override
	public List<Admin> getAllAdmins() {
		List<Admin> admin = adminRepository.findAll();
		return admin;
	}

	@Override
	public Admin getOneAdmin(int id) {
		Admin admin = adminRepository.findById(id).orElseThrow();
		return admin;
	}

	@Override
	public Admin postOneAdmin(Admin admin) {
		
		return adminRepository.save(admin);
	}

	@Override
	public Admin putOneAdmin(int id, Admin admin) {
		
		getOneAdmin(id);
		admin.setAdminID(id);
		return adminRepository.save(admin);
	}

	@Override
	public void deleteOneAdmin(int id) {
		getOneAdmin(id);
		adminRepository.deleteById(id);
	}
	
	
	
}
