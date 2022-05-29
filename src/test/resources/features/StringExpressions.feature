# tests created by: Hyulya Gyuler
Feature: Comparing words, sentences and counting words.

  Rule: Remove certain characters from the input word and then validate
    @CompareWords
    Scenario: Compare words
      Given user inputs the word "Examplesssz"
      When the letter "s" is removed
      And the letter "z" is removed
#      And the letter "w" is removed
#      And the letter "t" is removed
      Then verify the result is "example"

  Rule: Remove punctuation symbols from the input sentences and compare the sentences
    @CompareSentences
    Scenario: Compare sentences
      Given _First sentence is set to: "My sentence!!?"
      When first occurrence of symbol "!" is removed
      Given _Second sentence is set to: "My sentence (and more…)"
      When all occurrences of symbol "(" is removed
      When all occurrences of symbol ")" is removed
      And case sensitivity is set
      Then check the equality of _First sentence and _Second sentence

  Rule:
   @CountWords
   Scenario: Count words
     Given the input is a paragraph of text
     """
     This is my example text that I will use for counting the words in this task
     """
     Then print the Word Count


