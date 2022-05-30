# tests created by: Hyulya Gyuler
Feature: Comparing words, sentences and counting words.

  Background:
    * case sensitivity is set to true
    * case sensitivity is set to false

  Rule: Remove certain characters from the input word and then validate
    @CompareWords
    Scenario: 1. Compare words
      Given user inputs the word "Examplesssz"
      When the letter "s" is removed
      And the letter "z" is removed
      Then verify the result is "example"

  Rule: Remove punctuation symbols from the input sentences and compare the sentences
    @CompareSentences
    Scenario: 2. Compare sentences
      Given _First sentence is set to: "My sentence!!?"
      And first occurrence of symbol "!" is removed
      When _Second sentence is set to: "My sentence (and more…)"
      And all occurrences of symbol "(" is removed
      And all occurrences of symbol ")" is removed
      Then check the equality of _First sentence and _Second sentence

  Rule:
   @CountWords
   Scenario: 3. Count words
     Given the input is a paragraph of text
     """
     This is my example text that I will use for counting the words in this task
     """
     Then print the word count


