Feature: Create a User
  As a user
  I want to be able to register on the website

  Scenario: Register as a new user
      Given I am on the create user website
      When I enter my forename as "Bindu"
      And I enter my surname as "test"
      And I enter my email as "test@test.com"
      And I enter my age as "32"
      And I enter the title as "Mrs"
      And I click on save my details
      Then I should be registered as a new user

   Scenario: Register as a new user and verify registration details
      Given I am on the create user website
      When I enter my forename as "Bindu"
      And I enter my surname as "test"
      And I enter my email as "test@mail.com"
      And I enter my age as "32"
      And I enter the title as "Mrs"
      And I click on save my details
      Then I should be registered as a new user
      And My name must be "Bindu test"
      And My age must be "32"
      And My email must be "test@mail.com"

   Scenario: Register as a new user and verify validation on forename
      Given I am on the create user website
      When I enter my forename as ""
      And I enter my surname as "test"
      And I enter my email as "test@mail.com"
      And I enter my age as "32"
      And I enter the title as "Mrs"
      And I click on save my details
      Then I must see validation message "Please enter a forename"

   Scenario: Register as a new user and verify validation on surname
      Given I am on the create user website
      When I enter my forename as "Bindu"
      And I enter my surname as ""
      And I enter my email as "test@mail.com"
      And I enter my age as "32"
      And I enter the title as "Mrs"
      And I click on save my details
      Then I must see validation message "Please enter a surname"

   Scenario: Register as a new user validation on age field
       Given I am on the create user website
       When I enter my forename as "Bindu"
       And I enter my surname as "test"
       And I enter my email as "test@mail.com"
       And I enter my age as "110"
       And I enter the title as "Mrs"
       And I click on save my details
       Then I must not be able to save the details

