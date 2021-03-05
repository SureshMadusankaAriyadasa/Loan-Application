package com.springboot.app.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduserdetails")
    private int iduserdetails;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="add_line1")
    private String add_line1;

    @Column(name="add_line2")
    private String add_line2;

    @Column(name="city")
    private String city;

    @Column(name="email")
    private String email;
    @Column(name="tel_no")
    private String tel_no;
    @Column(name="iduser_details")
    private int iduser_details;
    @Column(name="NIC")
    private String NIC;
    @Column(name="bank_acc_no")
    private int bank_acc_no;

    public UserDetails() {

    }

    public int getIduserdetails() {
        return iduserdetails;
    }

    public void setIduserdetails(int iduserdetails) {
        this.iduserdetails = iduserdetails;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdd_line1() {
        return add_line1;
    }

    public void setAdd_line1(String add_line1) {
        this.add_line1 = add_line1;
    }

    public String getAdd_line2() {
        return add_line2;
    }

    public void setAdd_line2(String add_line2) {
        this.add_line2 = add_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public int getIduser_details() {
        return iduser_details;
    }

    public void setIduser_details(int iduser_details) {
        this.iduser_details = iduser_details;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int getBank_acc_no() {
        return bank_acc_no;
    }

    public void setBank_acc_no(int bank_acc_no) {
        this.bank_acc_no = bank_acc_no;
    }

    public UserDetails(int iduserdetails, String firstname, String lastname, String add_line1, String add_line2, String city, String email, String tel_no, int iduser_details, String NIC, int bank_acc_no) {
        this.iduserdetails = iduserdetails;
        this.firstname = firstname;
        this.lastname = lastname;
        this.add_line1 = add_line1;
        this.add_line2 = add_line2;
        this.city = city;
        this.email = email;
        this.tel_no = tel_no;
        this.iduser_details = iduser_details;
        this.NIC = NIC;
        this.bank_acc_no = bank_acc_no;
    }
}

