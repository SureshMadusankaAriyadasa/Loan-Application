package com.springboot.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.Model.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users, Integer>  {

	public Users findByUsername(String username);

}
