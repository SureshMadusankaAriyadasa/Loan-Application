package com.springboot.app.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Model.Users;
import com.springboot.app.Service.UsersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/all")
    public List<Users> list() {
        return usersService.listAllUser();
    }
    
    @RequestMapping(value="/adduser", method=RequestMethod.POST)    
    public void addUser(@RequestBody Users users)  
    {    
    usersService.addUser(users);    
    }
    
    @DeleteMapping("delete/{id}")  
    private void deleteUser(@PathVariable("id") int id)   
    {  
    usersService.delete(id);  
    }  
    
    @PutMapping("/update")  
    private int saveUser(@RequestBody Users users)   
    {  
    usersService.saveOrUpdate(users);  
    return users.getIduser();  
    }  
    
    @GetMapping("/{id}")  
    private Optional<Users> getSearch(@PathVariable("id") int id)   
    {  
    return usersService.getUserByUsernameId(id);  
    }
    
    @GetMapping("search/{username}")
    public Users get(@PathVariable String username) {
    	return usersService.get(username);
    }
}
