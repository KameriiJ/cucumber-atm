Feature: overdraw normal account
     As a bank
     The normal account that cannot overdrawn and the OD account that can be overdrawn
     (with a negotiated amount specified when the account was open).
    
Background:
    Given a customer with id 1 and pin 111 with balance 200 in normal account
    And I login to ATM with id 1 and pin 111

Scenario: Overdraw amount of normal account
    When I overdraw 5000 from ATM
    Then my account balance is 200