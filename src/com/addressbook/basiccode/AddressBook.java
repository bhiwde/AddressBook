package com.addressbook.basiccode;

import java.util.Scanner;
/**
 * 
 * @author admin
 * Addressbook Handling Contact Management Task
 */

public class AddressBook {
	Contacts contacts = new  Contacts();
	 Scanner sc = new Scanner(System.in);
public void addContact() {
		System.out.println("Enter the FirstName:");
		contacts.setFirstname(sc.next());
	    System.out.println("Enter the LastName:");		
	    contacts.setLastname(sc.next());
       System.out.println("Enter the Address:");
		contacts.setAddress(sc.next());
       System.out.println("Enter the State:");
		contacts.setState(sc.next());
       System.out.println("Enter the City:");
		contacts.setCity(sc.next());
       System.out.println("Enter the Zip:");	
		contacts.setZip(sc.next());
       System.out.println("Enter the Phonenumber:");
		contacts.setPhonenumber(sc.next());
       System.out.println("Enter the Email:");		
		contacts.setEmail(sc.next());
		
		}
	
public void showContact()
{
	if(contacts == null) {
		System.out.println("Contacts Object is not available");
	}
	else
	{
      System.out.println("First Name:"+contacts.getFirstname());
      System.out.println("Last Name:"+contacts.getLastname());
	  System.out.println("Address:"+contacts.getAddress());
	  System.out.println("State:"+contacts.getState());
	  System.out.println("City:"+contacts.getCity());
	  System.out.println("Zip:"+contacts.getZip());
	  System.out.println("Phonenumber:"+contacts.getPhonenumber());
	  System.out.println("Email:"+contacts.getEmail());
	  }
}

 public void updateContact() {
	 System.out.println("Enter the First Name Update Contact:");
	 String fname = sc.next();
	  {
		  if(fname.equals(contacts.getFirstname())) {
	 System.out.println("Contact is available");
	 System.out.println("Enter the Last Name:");		
	    contacts.setLastname(sc.next());
    System.out.println("Enter the Address:");
		contacts.setAddress(sc.next());
    System.out.println("Enter the State:");
		contacts.setState(sc.next());
    System.out.println("Enter the City:");
		contacts.setCity(sc.next());
    System.out.println("Enter the Zip:");	
		contacts.setZip(sc.next());
    System.out.println("Enter the Phonenumber:");
		contacts.setPhonenumber(sc.next());
    System.out.println("Enter the Email:");		
		contacts.setEmail(sc.next());
	 }
 else
         {
	 System.out.println("Contact is not availbale");
	 }
	   }
 }
 
 public void deleteContact() {
	 System.out.println("Enter the First Name to Delete the Contact:");
	 String fname = sc.next();
	 
	 if(fname.equals(contacts.getFirstname())) 
		 {
			  System.out.println("Contact is available");
		  contacts = null;
			System.out.println("Contact is  Deleted.");
		 }
		 
	 else
	 {
			 System.out.println("Contact is not availbale");
			 }
	 }
	 
 }





