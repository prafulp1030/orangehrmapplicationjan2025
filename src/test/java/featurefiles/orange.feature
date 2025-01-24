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
