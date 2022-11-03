package com.guvenleye.guvenleYe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guvenleye.guvenleYe.entities.Admin;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public interface AdminRepository extends JpaRepository<Admin,Integer>{

	
}
