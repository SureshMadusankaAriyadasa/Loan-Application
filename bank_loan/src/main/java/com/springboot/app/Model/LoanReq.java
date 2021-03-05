package com.springboot.app.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_req")
public class LoanReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idloan_req")
    private int idloan_req;

    @Column(name="req_amount")
    private String req_amount;

    @Column(name="user_id")
    private int user_id;

    @Column(name="accept")
    private boolean accept;

    @Column(name="loan_type")
    private String loan_type;

    @Column(name="interest_rates")
    private int interest_rates;

    @Column(name="duration")
    private String duration;

    public LoanReq() {

    }

    public int getIdloan_req() {
        return idloan_req;
    }

    public void setIdloan_req(int idloan_req) {
        this.idloan_req = idloan_req;
    }

    public String getReq_amount() {
        return req_amount;
    }

    public void setReq_amount(String req_amount) {
        this.req_amount = req_amount;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public int getInterest_rates() {
        return interest_rates;
    }

    public void setInterest_rates(int interest_rates) {
        this.interest_rates = interest_rates;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public LoanReq(int idloan_req, String req_amount, int user_id, boolean accept, String loan_type, int interest_rates, String duration) {
        this.idloan_req = idloan_req;
        this.req_amount = req_amount;
        this.user_id = user_id;
        this.accept = accept;
        this.loan_type = loan_type;
        this.interest_rates = interest_rates;
        this.duration = duration;
    }
}
