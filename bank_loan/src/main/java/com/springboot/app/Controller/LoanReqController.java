package com.springboot.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Model.LoanReq;

import com.springboot.app.Service.LoanReqService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/loan_details")
public class LoanReqController {
	LoanReqService loanReqService;
		@GetMapping("/all")
		public List<LoanReq> list() {
		    return loanReqService.listAllLoanDetails();
		}
		
	    @PutMapping("/update")  
	    private int saveUser(@RequestBody LoanReq loanReq)   
	    {  
	    	loanReqService.saveOrUpdate(loanReq);  
	    return loanReq.getIdloan_req();  
	    } 
	    
	    @RequestMapping(value="/req_loan", method=RequestMethod.POST)    
	    public void create_loan(@RequestBody LoanReq loanReq)  
	    {    
	    	loanReqService.create_loan(loanReq);    
	    }
	    
	    @GetMapping("/{id}")  
	    private Optional<LoanReq> getSearchLoan(@PathVariable("id") int id)   
	    {  
	    return loanReqService.getLoanById(id);  
	    }
	    
	    @DeleteMapping("delete/{id}")  
	    private void deleteLoanReq(@PathVariable("id") int id)   
	    {  
	    	loanReqService.deleteLoan(id);  
	    }
}
