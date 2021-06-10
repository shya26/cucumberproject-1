Feature: changecurrency
@test1
  Scenario: User should be able to change currency successfully, so that they can use all currency features
  Given user is on change currency
  When user enter own chose currency
  Then user should able to change currency
