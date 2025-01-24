Feature: Test Orange HRM Application

  Scenario: validate Login Functionality by entering username
    Given user enter "admin" username
    And user click on login button
    Then user capture warning error message on password text box

  #AfterHooks -- Refresh Page
  Scenario: validate Login Functionality by entering password
    Given user enter "11345" password
    And user click on login button
    Then user capture warning error message on username text box

  #AfterHooks -- Refresh Page
  Scenario: validate Login Functionality by entering invalid credentails
    Given user enter "admin" username
    And user enter "11345" password
    And user click on login button
    Then user capture invalid warning error message

  #AfterHooks -- Refresh Page
  Scenario: validate Login Functionality by entering valid credentails
    Given user enter "Admin" username
    And user enter "admin123" password
    Then user click on login button

  Scenario: Validate HomePage Funtionality
    When user is on homepage validate logo
    And user validate url
    And user validate Title
    And User click on Pimlink

  Scenario: Valdiate Pim Page Functionlaity
    When user is on pim page he validates PimPage url
    And user click on addEmployee button
    Then user enters firstname and lastname
    And user click on save button

  Scenario: Enter Employ Personal Information
    When user is on personalInfo page capture Empid
    And user select his Nationality
    And user click on personalInfo page save button
    
   Scenario: Validate Search User Functionallity
    When user click on employeeList button
    Then user enter captured userId in text box
    And user click on search button
    
