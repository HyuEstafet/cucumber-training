@NumericExpressions
Feature: Calculations of sums for different data types

  Background:
    Given there is a Calculator

  Rule: The numbers are Integer
    @AddingPositiveIntegers
    Scenario: Adding positive Integers
      Given we add int numbers 3 and 5
      When expected input result is 8
      Then we check the result is correct

  Rule: The numbers are Decimal
    @AddingPositiveDecimals
    Scenario: Adding positive Decimals
      Given we add decimal numbers 1.2 and 3.0
      When expected decimal input result is 4.2
      Then we check the decimal result is correct


