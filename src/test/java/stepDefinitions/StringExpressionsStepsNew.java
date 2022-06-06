package stepDefinitions;

import helpers.StringHelperNew;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExpressionsStepsNew {

    StringHelperNew helperNew = new StringHelperNew();
    private boolean isCaseSensitive;
    private String firstInputWord;
    private String secondInputWord;
    private String firstInputSentence;
    private String secondInputSentence;
    String givenParagraph;
    private int totalWordCount;
    private int totalCharCount;

    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

    @Given("case sensitivity is set to {booleanValue}")
    public void case_sensitivity_is_set_to(Boolean bool) {
        isCaseSensitive = bool;
    }

    @Given("first input word is {word}")
    public void first_input_word_is(String firstWord) {
        firstInputWord = firstWord;
        System.out.println(firstInputWord);
    }

    @When("second input word is {word}")
    public void second_input_word_is(String secondWord) {
        secondInputWord = secondWord;
        System.out.println(secondInputWord);
    }

    @Then("we verify {word} and {word} are equal or not")
    public void we_verify_the_words_are_equal(String wordOne, String wordTwo) {
        System.out.printf("Comparing %s with %s", wordOne, wordTwo);
        assertTrue(StringHelperNew.areWordsEqual(firstInputWord, secondInputWord, isCaseSensitive),
                "Words are not matching and are not equal!");
    }

    @Given("first sentence is {string}")
    public void first_sentence_is_cucumber_is_amazing(String sentenceOne) {
        firstInputSentence = sentenceOne;
        System.out.println("First sentence: " + firstInputSentence);
    }

    @When("second sentence is {string}")
    public void second_sentence_is_cucumber_is_amazing(String sentenceTwo) {
        secondInputSentence = sentenceTwo;
        System.out.println("Second sentence: " + secondInputSentence);
    }

    @Then("we verify {string} and {string} are equal or not")
    public void we_verify_cucumber_is_amazing_and_cucumber_is_amazing_are_equal_or_not(String sentenceOne, String sentenceTwo) {
        System.out.printf("Comparing %s and %s%n",sentenceOne,sentenceTwo );
        assertTrue(StringHelperNew.areSentencesEqual(firstInputSentence,secondInputSentence,isCaseSensitive),"Sentences are not matching and are not equal!");
    }

    @Given("the input is a text paragraph")
    public void the_input_is_a_text_paragraph(String docString) {
        givenParagraph = docString;
    }
    @When("the word count is done")
    public void the_word_count_is_done() {
        totalWordCount = StringHelperNew.getWordsCountFromText(givenParagraph);
        System.out.println("Total word count: " + totalWordCount);
    }
    @Then("the result is verified to equal {int} words")
    public void the_result_is_verified(int numberOfWords) {
        assertEquals(numberOfWords,totalWordCount,"The actual total word count is not equal to the expected word count!");
    }
    @When("the char count is done")
    public void the_char_count_is_done() {
        totalCharCount = StringHelperNew.getCharsCount(givenParagraph);
        System.out.println("Total char count: " + totalCharCount);
    }
    @Then("the result is verified to equal {int} chars")
    public void the_result_is_verified_to_equal_chars(int numberOfChars) {
        assertEquals(numberOfChars,totalCharCount,"The actual total char count is not equal to the expected char count!");

    }
}
