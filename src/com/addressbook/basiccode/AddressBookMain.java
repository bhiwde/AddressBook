package com.addressbook.basiccode;

import java.util.Scanner;

/***
 * 
 * 
 * @author admin
 * @since
 * AddressBookMain Class is used for performing different 
 * operation on AddressBook
 * */
class AddressBookMain {

	public static void main(String[] args)
	{
		/* welcome message for user
		 * 
		 */
    System.out.println("Welcome to AddressBook");
    
   Scanner sc = new Scanner(System.in);
    int choice;
    AddressBook addressbook = new AddressBook();
   	 
   	 do {
   		 System.out.println("ADDRESSBOOK MANU");
   		 System.out.println("1.ADD CONTACT \n2.SHOW CONTACT \n3.UPDATE CONTACT \n4.DELETE CONTACT");
   		 System.out.println("Enter the choice");
   	    
          choice = sc.nextInt();
   		 switch(choice) {
   		 case 1:
   			 addressbook.addContact();
   			 break;
   		 case 2:
   			 addressbook.showContact();
   			 break;
   		 case 3:
   			 addressbook.updateContact();
   			 break;
   		 case 4:
   			 addressbook.deleteContact();
   			break;
   			 default:
   				 System.out.println("Invalid Choice");
   				 break;
   		 }
    }while(choice<5);
   	}   
    	   }
