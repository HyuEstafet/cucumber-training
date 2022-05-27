# tests created by: Hyulya Gyuler
Feature: Comparing words, sentences and counting words.

  Rule: Remove certain characters from the input word and validate
    @CompareWords
    Scenario: Compare words
      Given user inputs the word "Examplesssz"
      When the letter "s" is removed
      And the letter "z" is removed
#      And the letter "w" is removed
#      And the letter "t" is removed
      Then verify the result is "example"

  Rule:
