@ReceiveMessageFeature
Feature: Receive Messages in my Set Language
  As an User
  I want to receive messages in my set language

  @ReceiveMessageScenario
  Scenario Outline: Receive messages with all necessary infos
    Given I am the user "<name>"
    And my language is set to "<language>"
    When the system sends the message "Invalid login"
    Then I should see the message "<message>"

    Examples: 
      | name      | language | message             |
      | fcastillo | italian  | Login non valido    |
      | smirnoff  | polish   | Nieprawidtowy login |