Feature: Login

  # ctrl+alt+l - to fix the table/lines etc

  @smoke
  Scenario: Login with single username and password
    Given I am on Booking.com homepage
    And I click on Sign in link
    And I enter my email address as taltekc@gmail.com
    And I click on next button
    And I enter my password as Te$t1234
    When I click on Sign in button
    Then I will see my full name in header

#  Scenario: Signup for an new user account
#    Given I am on talentTEK homepage
#    When I click on next button
#    Then I start filling out the form with following data
#      | firstName | lastName | dateOfBirth | gender |
#      | Hassan    | Bhuiyan  | 11-1986     | male   |

#  Scenario Outline: Login with multiple userName and password
#    Given I am on talentTEK homepage
#    Then I enter following <userName> and <password>
#    Examples:
#      | userName  | password |
#      | Username1 | pass1    |
#      | username2 | pass2    |
#      | username3 | pass3    |