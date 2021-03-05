package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.Model.UserDetails;


@Repository
public interface UserDetailsRepository extends JpaRepository <UserDetails, Integer>  {
	public UserDetails findByFirstname(String firstname);

}
