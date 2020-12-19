Feature: Payment

  # ctrl+alt+l - to fix the table/lines etc

  @smoke
  Scenario: I am going to make a payment
    Given I am going to search where I am going to
    Then I enter my username as "payment" and password as "paymentPassword@123"
