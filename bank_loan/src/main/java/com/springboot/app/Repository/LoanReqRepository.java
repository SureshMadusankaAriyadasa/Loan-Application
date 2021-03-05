package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.Model.LoanReq;


@Repository
public interface LoanReqRepository extends JpaRepository <LoanReq, Integer>  {
	

}
