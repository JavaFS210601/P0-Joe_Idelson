package com.revature.models;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.EmployeeDao;

public class Menu {
	EmployeeDao ed = new EmployeeDao();

	// All of the menu display options and control flow are contained in this method
	public void display() {
		
		boolean displayMenu = true; // this toggles whether the menu continues after user input
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // Scanner object to parse user input
		
		final Logger log = LogManager.getLogger(Menu.class);
		
		
		
		// greeting
		System.out.println("Welcome to the Diablo Foods Employee Management System");
		System.out.println("*====================================================*");
		
		// display the menu options as long as displayMenu is true
		while(displayMenu) {
			
			System.out.println("-----------------");
			System.out.println("CHOOSE AN OPTION");
			System.out.println("-----------------");
			
			// menu options
			System.out.println("employees -> show all employees");
			System.out.println("add -> add a new employee ");
			System.out.println("changerole -> change an employee's role");
			System.out.println("fire -> fire an employee");
			System.out.println("exit -> exit the application");

			// parse the user input after they choose a menu option, and move to the next line
			String input = scan.nextLine().toLowerCase();
			
			// switch statement that takes the user input, and does some logic depending on that input
			switch(input) {
				
			case "employees" : {
				log.info("User selected all employees");
				System.out.println("Gathering all employees....");

				// List of Employees that gets populated by the getEmployees method in our EmployeeDao
				List<Employee> employees = ed.getEmployees(); 
				// Print out each Employee from the List one by one for the user to see
				for(Employee e: employees) {
					//System.out.println(e);
					System.out.println(e.getEmployee_id() + ") " + e.getF_name() + " " + e.getL_name() + ", hired on: " + e.getHire_date());
				}
				break;
			}
			
			case "add" : {
				// we need to prompt the user for the employee's name, and their role id
				System.out.println("Enter Employee's First Name:");
				String f_name = scan.nextLine();
				
				System.out.println("Enter Employee's Middle Name:");
				String m_name = scan.nextLine();
				
				System.out.println("Enter Employee's Last Name:");
				String l_name = scan.nextLine();
				
				System.out.println("Enter Employee's DOB:");
				String dob = scan.nextLine();
				
				System.out.println("Enter Employee's Phone #:");
				String phone = scan.nextLine();
				
				System.out.println("Enter Employee's Street Address:");
				String street_address = scan.nextLine();
				
				System.out.println("Enter Employee's City:");
				String city = scan.nextLine();
				
				System.out.println("Enter Employee's Zip Code:");
				String zip_code = scan.nextLine();
				
				System.out.println("Enter Employee's Gender:");
				String gender = scan.nextLine();
				
				System.out.println("Enter Employee's Marital Status:");
				String marital_status = scan.nextLine();
				
				System.out.println("Enter Employee's Hire Date:");
				@SuppressWarnings("unused")
				String hire_date = scan.nextLine();
				
				System.out.println("Enter Role Id: "
						+ "1)General Manager "
						+ "2)Butcher "
						+ "3)Cashier "
						+ "4)Cook "
						+ "5)Courtesy Clerk "
						+ "6)Produce Worker "
						+ "7)Kitchen Manager "
						+ "8)Meat Department Manager "
						+ "9)Wine Manager "
						+ "10)Parking Lot Attendant "
						);
				int roleId = scan.nextInt();
				scan.nextLine(); // because without nextLine, your enter keystroke will be grabbed as the next input
				
				// Given all this information, we'll create a new Employee object to send to a DAO method
				Employee newEmployee = new Employee(f_name, m_name, l_name, dob, phone, street_address, city, zip_code, gender, marital_status, "placeholder", roleId); // placeholder for hire_date will be changed
				
				// Put the new Employee into the addEmployee() method in the EmployeeDao
				ed.addEmployee(newEmployee);
				
				
				break;
			}
			
			case "changerole" : {
				
				System.out.println("These are the employees on the roster: ");
				// this is using the already existing getEmployees() method
				List<Employee> employees = ed.getEmployees(); 
				
				for(Employee e: employees) {
					System.out.println(e);
				}
				
				System.out.println("-------------------------------------------");
				
				
				System.out.println("Enter the ID of the employee who's role is changing:");
				int idInput = scan.nextInt(); //the user enters the ID of the employee to 
				scan.nextLine();
				
				System.out.println("Enter Role Id: + \"1) General Manager\"\r\n"
						+ "						+ \"2) Butcher\"\r\n"
						+ "						+ \"3) Cashier\"\r\n"
						+ "						+ \"4) Cook\"\r\n"
						+ "						+ \"5) Courtesy Clerk\"\r\n"
						+ "						+ \"6) Produce Worker\"\r\n"
						+ "						+ \"7) Kitchen Manager\"\r\n"
						+ "						+ \"8) Meat Department Manager\"\r\n"
						+ "						+ \"9) Wine Manager\"\r\n"
						+ "						+ \"10) Parking Lot Attendant\""
						);
				int roleInput = scan.nextInt();
				scan.nextLine();
				
				ed.changeRole(idInput, roleInput); // we're going to supply the user inputs as arguments to this DAO method
				
				break;
				
				
			}
			
			case "fire":{
				System.out.println("These are the employees on the roster.... who will you fire?");
				
				List<Employee> employees = ed.getEmployees(); 
				
				for(Employee e: employees) {
					System.out.println(e);
				}
				
				System.out.println("-------------------------------------------");
				
				System.out.println("Enter the employee id of the employee to fire:");
				
				int idInput = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter Role Id: + \"1) General Manager\"\r\n"
						+ "						+ \"2) Butcher\"\r\n"
						+ "						+ \"3) Cashier\"\r\n"
						+ "						+ \"4) Cook\"\r\n"
						+ "						+ \"5) Courtesy Clerk\"\r\n"
						+ "						+ \"6) Produce Worker\"\r\n"
						+ "						+ \"7) Kitchen Manager\"\r\n"
						+ "						+ \"8) Meat Department Manager\"\r\n"
						+ "						+ \"9) Wine Manager\"\r\n"
						+ "						+ \"10) Parking Lot Attendant\""
						);
				
				int roleInput = scan.nextInt();
				scan.nextLine();

		

				if(roleInput == 1) {
					System.out.println("You can not fire a General Manager!");
					log.warn("User attempted to delete a General Manager");
				} else {
					System.out.println("Employee was fired succesfully!");
				}
				
				break;
			}
			
			case "exit" : {
				System.out.println("byeeeee");
				displayMenu = false;
				break;
				
			}
			
			default: {
				System.out.println("Didn't catch that... try again"); // in case user input doesn't match any cases
			}
			
		}	
	}
}
}
