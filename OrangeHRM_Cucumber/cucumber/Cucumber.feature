Feature:OrangeHRM Application Functionality Test
Scenario:Validating OrangeHRM Application LogIn Page Test
Given User Should Open Chrome Browser in the sysyem
When User enterd OrangeHRM Application Url Address
Then User Should be navigated to OrangeHRM Application LogIn Page
#Then User Should Close the OrangeHRM Application with the Browser



Scenario:Validating OrangeHRM Application LogIn Page Test
Given User Should Open Chrome Browser in the sysyem
When User enterd OrangeHRM Application Url Address
Then User Should be navigated to OrangeHRM Application LogIn Page
Then User Should enter UserName and Password and click on LogIn button
Then User Should be able to navigated to OrangeHRM Application HomePage
Then User Should LogOut of the OrangeHRM Application
Then User Should Close the OrangeHRM Application with the Browser


Scenario:Validating OrangeHRM Application LogIn Functionality Test with TestData
#Give User Should Open Chrome Browser in the sysyem
When User enterd OrangeHRM Application Url Address
Then User Should be navigated to OrangeHRM Application LogIn Page
Then User Should enter "<UserName>" and "<Password>" and click on LogIn button
Then User Should be able to navigated to OrangeHRM Application HomePage
Then User Should LogOut of the OrangeHRM Application
Then User Should Close the OrangeHRM Application with the Browser