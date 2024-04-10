package email;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String defaultPassword;
	private String department;
	private int mailboxcapacity = 500;
	private String alternatemail;
	private String email;
	private String companyname = "infinite.com";
	
	//Constructor to receive the firstname and the lastname
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		//System.out.println("Email Created: " +this.firstname+ " " +this.lastname);
		
		//Call a method asking for department and then return the department
		//*****************************************************///
		this.department = setDepartment(); //here we r getting all the info from stdepartment to add info for this name
		//System.out.println("Department: " +this.department);
		
		//Call a method that returns random password
		//*****************************************************//
		this.password = setRanpassword(8);
		System.out.println("Your Password is:- " +this.password);
		
		//Combine elements to generate Email.
		//**********************************************************//
		//this.companyname = companyname;
		email = firstname.toLowerCase()+ "." + lastname.toLowerCase() +"@" + department + "." + companyname;
		//System.out.println("Your Email is: " +this.email);
	}
	
	 //Ask for the department
	private String setDepartment() {
		System.out.println("New Worker:- " + firstname +  " Enter Department code\n1) For Sales\n2) For Development\n3) For Marketing\n4) For Accounting\n5) For None\n Enter Department Code:-");
		Scanner s = new Scanner(System.in);
		int deptChoice = s.nextInt();
		if(deptChoice == 1) { return "Sales"; }
		else if(deptChoice == 2) { return "Development"; }
		else if(deptChoice == 3) { return "Marketing"; }
		else if(deptChoice == 4) { return "Accounting"; }
		else { return ""; }
		
	}
	
	//Create a random password
	public String setRanpassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*abcdefghijklmnopqrstuvwxyz";
		char[] password = new char[length];
		for(int i = 0; i < length; i ++) {
			int rand = (int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
		} 
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	//Set the alternate email
	public void setalternatemail(String altemail) {
		this.alternatemail = altemail;
	}
	
	
	//Change the password
	public void setchangepassword(String password) {
		this.password = password;
	}
	
	public int getmailboxcapacity() { return mailboxcapacity;}
	public String getalternatemail() { return alternatemail;}
	public String getchangepassword() { return password;}
	
	public String showInfo() {
		return "DISPLAY:- " + firstname + " " + lastname + 
				"\nCOMPANY EMAIL:- " + email + 
				"\nMAILBOX CAPACITY:- " + mailboxcapacity;
	}

}

