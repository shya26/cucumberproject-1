@all
Feature: Registration
@Test @regression @smoke
  Scenario: User should be able to register successfully, so that they can use all website features
    Given user is on registration page
    When user enters all required registration details
    Then User should able to register successfully

@regression
    Scenario: user should not able to re@ without mendetory details