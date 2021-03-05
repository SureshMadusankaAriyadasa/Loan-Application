package com.springboot.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Users;
import com.springboot.app.Repository.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> listAllUser() {
        return usersRepository.findAll();
    }
    
    public void addUser(Users users)  
    {    
    usersRepository.save(users);    
    }
    
    public void delete(int id)   
    {  
    usersRepository.deleteById(id);
    }
    
    public void saveOrUpdate(Users users)   
    {  
    usersRepository.save(users);  
    }
    

	public Optional<Users> getUserByUsernameId(int id) {
		return usersRepository.findById(id);
	}
    //@Autowired
    //private UserRepository userRepository;
	public Users get(String username) {
		Users user =  usersRepository.findByUsername(username);
		user.getPassword();
		return user;
	}
}
