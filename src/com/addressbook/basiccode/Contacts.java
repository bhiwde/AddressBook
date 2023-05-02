package com.addressbook.basiccode;

/**
 * 
 * @author admin
 * Contacts class for Adding and Managing the Contacts Information
 * Containing data members and Setter Getter method
 */
public class Contacts {
	 private String firstname;
     private String  lastname;
     private String address;
     private String city;
     private String state;
     private String zip;
     private String phonenumber;
     private String email;
     
     public void setFirstname(String firstname) {
   	  this.firstname = firstname;
     }
     public void setLastname(String lastname) {
   	  this.lastname = lastname;
     }
     public void setAddress(String address) {
   	  this.address = address;
     }

     public void setCity(String city) {
   	 this.city = city;
     }
     public void setState(String state) {
	  this.state = state;
     }
     public void setZip(String zip) {
	  this.zip = zip;
	  }
     public void setPhonenumber(String phonenumber) {
	  this.phonenumber = phonenumber;
     }
     public void setEmail(String email) {
	  this.email = email;
     }
     public String getFirstname() {
	  return this.firstname;
     }
     public String getLastname() {
	  return this.lastname;
     }
     public String getAddress() {
	  return this.address;
     }
     public String getState() {
     return this.state;
     }
     public String getCity()
     {
	  return this.city;
     }
     public String getZip() {
	  return this.zip;
     }
     public String getPhonenumber() {
	  return this.phonenumber;
     }
     public String getEmail() {
	  return this.email;
     }
     }



