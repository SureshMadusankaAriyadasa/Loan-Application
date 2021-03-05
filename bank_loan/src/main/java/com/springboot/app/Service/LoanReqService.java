package com.springboot.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.LoanReq;
import com.springboot.app.Repository.LoanReqRepository;

@Service
public class LoanReqService {
	@Autowired
    private LoanReqRepository loanReqRepository;
	public List<LoanReq> listAllLoanDetails() {
		return loanReqRepository.findAll();
	}
	public void saveOrUpdate(LoanReq loanReq) {
		loanReqRepository.save(loanReq);
	}
	public void create_loan(LoanReq loanReq) {
		
		loanReqRepository.save(loanReq);    
	}
	public Optional<LoanReq> getLoanById(int id) {
		return loanReqRepository.findById(id);
	}
	public void deleteLoan(int id) {
		loanReqRepository.deleteById(id);		
	}

}
