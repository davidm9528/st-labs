package tests;

import bankingProject.User;

public class UserTests {

	public static void main(String[] args) {
		System.out.println("**Running main in UserTests class**");
		
		String test_username = "BobsAcc";
		String test_password = "my_password";
		String test_first_name = "Bob";
		String test_last_name = "Johnson";
		String test_mobile_number = "07938585676";
		
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		//System.out.println(testUser);
		
		//Testing all getters work (i.e they are equal to the expected outcome
		
		Boolean passed = true;
		
		
		if(testUser.getUsername() != test_username) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		
		if(testUser.getFirst_name() != test_first_name) {
			System.out.println("TC2 failed: first name did not match");
			passed = false;
		}
		
		if(testUser.getLast_name() != test_last_name) {
			System.out.println("TC3 failed: last name did not match");
			passed = false;
		}
		
		if(testUser.getPassword() != test_password) {
			System.out.println("TC4 failed: password did not match");
			passed = false;
		}
		
		if(testUser.getMobile_number() != test_mobile_number) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}
		
		//assert 1==2;
		assert testUser.getUsername() == test_username;
		assert testUser.getFirst_name() == test_first_name;
		assert testUser.getLast_name() == test_last_name;
		assert testUser.getPassword() == test_password;
		assert testUser.getMobile_number() == test_mobile_number;
		
		
		if(passed) {		
			System.out.println("All Test cases passed.");
		}
	}
}
