@Navigaiton
Feature: User can use navigation bar

  @PositiveCase
  Scenario: User success open overview page
    Given user in home page
    When user click option button
    And user click overview button
    Then home will be showed"QA-14-BP-A"

  @PositiveCase
  Scenario: User success open blast page
    Given user in home page
    When user click option button
    And user click blast button
    Then home will be showed"Blasts"

  @PositiveCase
  Scenario: User success open board page
    Given user in home page
    When user click option button
    And user click board button
    Then home will be showed"Board - QA-14-BP-A"

  @PositiveCase
  Scenario: User success open check in page
    Given user in home page
    When user click option button
    And user click check in button
    Then home will be showed"Check-ins"

  @PositiveCase
  Scenario: User success open schedule page
    Given user in home page
    When user click option button
    And user click schedule button
    Then home will be showed"Schedules"

  @PositiveCase
  Scenario: User success open group chat page
    Given user in home page
    When user click option button
    And user click group chat button
    Then home will be showed"Group Chat - QA-14-BP-A"

  @PositiveCase
  Scenario: User success open doc & file page
    Given user in home page
    When user click option button
    And user click doc & file button
    Then home will be showed"Docs & Files"
