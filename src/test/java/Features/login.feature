Feature: Application login
  Background:
    Given validate the browser
    When  Browser is triggered
    Then  Browser is started
  @smoketest
  Scenario: Home Page Default Login
    Given User is on NetBanking landing Page
    When  User login into application with username and password
    Then  Home Page is Populated
    And   Cards are displayed
  @Regtest
  Scenario: Home Page Default Login
    Given User is on NetBanking landing Page
    When  User login into application with "John" and "1234"
    Then  Home Page is Populated
    And   Cards displayed are "yes"

  @smoketest
  Scenario: Home Page Default Login
    Given User is on NetBanking landing Page
    When  User login into application with "Jin" and "4321"
    Then  Home Page is Populated
    And   Cards displayed are "no"
  @Regtest
  Scenario: Home Page Default Login
    Given User is on NetBanking landing Page
    When  User sign up with following details
      | john | abcd | john@abcd.com | Australia | 4545454545|
    Then  Home Page is Populated
    And   Cards displayed are "false"
  @smoketest
  Scenario Outline: Home Page Default Login
    Given User is on NetBanking landing Page
    When  User login in to application with <Username> and <password>
    Then  Home Page is Populated
    And   Cards displayed are "no"
    Examples:
    | Username | password |
    | user1    | pass1    |
    | user2    | pass2    |
    | user3    | pass3    |
    | user4    | pass4    |

