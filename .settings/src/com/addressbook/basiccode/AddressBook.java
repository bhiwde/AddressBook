package com.addressbook.basiccode;

import java.util.Scanner;
/**
 * 
 * @author admin
 * Addressbook Handling Contact Management Task
 */

public class AddressBook {
	Contacts contacts = new Contacts();
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
		contacts.setEmail(sc.next());}
public void showContact()
{
      System.out.println("First Name:"+contacts.getFirstname());
      System.out.println("Last Name:"+contacts.getLastname());
	  System.out.println("Address:"+contacts.getAddress());
	  System.out.println("Last State:"+contacts.getState());
	  System.out.println("Last City:"+contacts.getCity());
	  System.out.println("Last Zip:"+contacts.getZip());
	  System.out.println("Last Phonenumber:"+contacts.getPhonenumber());
	  System.out.println("Email:"+contacts.getEmail());
}
       
}

	



