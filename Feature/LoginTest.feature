Feature: Valid Login and Logout
	This feature will test existing users to login and logout functionality to/from JUST EAT web page

Scenario: User should successfully be able to log-in   
	Given User is on the login page
	When User logs in with valid email address and password
	Then  User should be to logged in successfully
	And User should be redirected to landing page or where user last left-off 
	
Scenario: Successfull log out  
	Given User is already logged-in
	When User logout from JUST EAT
	Then  User should be to logged out successfully and remain on same page

