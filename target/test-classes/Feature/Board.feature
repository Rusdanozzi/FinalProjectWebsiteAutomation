@Board
Feature: success using Card and List function in Board page

  @PositiveCase
  Scenario: user success add list
    Given user in board page
    When create new list"List ke 2"
    Then new list will show

  @PositiveCase
  Scenario: user success add card
    Given user in board page
    When create new card"kartu baru 1"
    Then new card will show

  @PositiveCase
  Scenario: user success add comment in card
    Given user in board page
    When user add comment in card"ini comment card"
    Then the comment will be post"ini comment card"

  @PositiveCase
  Scenario: user success move card
    Given user in board page
    When move card to other list
    Then card move success

