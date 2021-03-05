package com.springboot.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Model.UserDetails;
import com.springboot.app.Service.UserDetailsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user_details")
public class UserDetailsController {
	@Autowired
	UserDetailsService userDetailsService;

    @GetMapping("/all")
    public List<UserDetails> list() {
        return userDetailsService.listAllUser();
    }
    
    @RequestMapping(value="/reg", method=RequestMethod.POST)    
    public void addUser(@RequestBody UserDetails userDetails)  
    {    
    	userDetailsService.addUser(userDetails);    
    }
    
    @PutMapping("/update")  
    private int saveUser(@RequestBody UserDetails userDetails)   
    {  
    	userDetailsService.saveOrUpdate(userDetails);  
    return userDetails.getIduser_details();  
    }
    
    @GetMapping("search/{firstname}")
    public UserDetails get(@PathVariable String firstname) {
    	return userDetailsService.get(firstname);
    }
}
