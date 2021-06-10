Feature:user login funcation
  @login
  Scenario: User should  not able to login with incorrect credential
    Given user is on homepage
    And user enter "<email>" and "<password>"
    And user click on login button
    Then user should not able to login
    And user should get "<error_message>"

     Example :
       | email                       | password  | error_message
       | jiya5@gmail.com             | 123456    | login was unsuccessfull.enter your correct password
       |                             |           | and try agian later.
       |om@gmail.com                 |  ads      |login was unsuccessfull.enter your correct password
       |                             |           | and try agian later.


