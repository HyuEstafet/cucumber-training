Feature: Cucumber Text Expressions task

  Background:
    * case sensitivity is set to false

  Scenario: Compare two words
    Given first input word is "Cucumber"
    When second input word is "cucumber"
    Then we verify "Cucumber" and "cucumber" are equal or not

  Scenario: Compare two sentences
    Given first sentence is "Cucumber is amazing!"
    When second sentence is "cucumber is amazing!"
    Then we verify "Cucumber is amazing!" and "cucumber is amazing!" are equal or not
