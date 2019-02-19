Feature: withdraw
    As a bank
    The normal account that cannot overdrawn and the OD account that can be overdrawn
    (with a negotiated amount specified when the account was open).

Background:
    Given a customer with id 1 and pin 111 with balance 200 in OD account
    And I login to ATM with id 1 and pin 111

Scenario: Withdraw amount less than balance
    When I withdraw 50 from ATM
    Then my account balance is 150

Scenario: Withdraw amount more than balance
    When I overdraw 5000 from ATM
    Then my account balance is -4800
