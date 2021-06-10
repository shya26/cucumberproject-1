Feature: getcomment
  @test1
  Scenario: User should be able to get comment successfully , and any time change it
    Given user is on get comment
    When user enter they first comment out
    Then user should able to get comment