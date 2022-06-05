package stepDefinitions;

import helpers.StringHelper;
import helpers.StringHelperNew;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExpressionsStepsNew {

    StringHelperNew helperNew = new StringHelperNew();
    private boolean isCaseSensitive;
    private String firstInputWord;
    private String secondInputWord;
    private String firstInputSentence;
    private String secondInputSentence;

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

}
