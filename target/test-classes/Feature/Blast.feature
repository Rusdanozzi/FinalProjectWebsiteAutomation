@Blast
Feature: Send Blast Message

  @PositiveCase
  Scenario: user success create blast
    Given user in blast page
    When create new blast message
    And input title"Blast ke 1"
    And input body"ini adalah blast ke 1"
    Then new blast message will show"Blast ke 1"

  @PositiveCase
  Scenario: user success create private blast
    Given user in blast page
    When create new blast message
    And input title"Blast private"
    And input body set private"ini adalah blast private"
    Then new blast message will show"Blast private"
