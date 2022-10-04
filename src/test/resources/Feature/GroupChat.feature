@GroupChat
Feature: Send Chat to group chat

  @PositiveCase
  Scenario: user success send chat
    Given user in chat page
    When send chat message"Halloo"
    Then chat message will show"Halloo"

  @PositiveCase
  Scenario: user success delete chat
    Given user in chat page
    When send chat message"Halloo"
    And user delete chat
    Then chat message will show"This message was deleted"

  @NegativeCase
  Scenario: user can't send blank message
    Given user in chat page
    When send chat message""
    Then chat will not send

