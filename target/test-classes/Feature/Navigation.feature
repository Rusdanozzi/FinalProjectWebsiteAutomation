@Navigaiton
Feature: Usable navigation bar

  @PositiveCase
  Scenario: user click home button
    Given user in home page
    When user click home button
    Then home will be showed