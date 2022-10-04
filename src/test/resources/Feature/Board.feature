@Board
Feature: Create Card and List in Board page

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


