package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExpressionsSteps {

    StringHelper stringHelper = new StringHelper();
    private String inputWord;
    private boolean isCaseSensitive;
    private String firstSentence;
    private String secondSentence;
    String inputText;

    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

    @Given("user inputs the word {word}")
    public void user_inputs_the_word(String inputString) {
        inputWord = inputString;
        System.out.println("The input string has been set to: " + inputWord);
    }

    @When("the letter(s) {word} is removed")
    public void the_letter_is_removed(String letter) {
        inputWord = inputWord.replace(letter, "");
        System.out.println("The updated string: " + inputWord);
    }

    @Then("verify the result is {word}")
    public void the_result_is(String finalResult) {
        System.out.println(String.format("Comparing %s with %s", finalResult, inputWord));
        assertTrue(StringHelper.compareWords(inputWord, finalResult, isCaseSensitive),
                "Expected string doesn't match the formatted input");
    }

    @Given("_First sentence is set to: {string}")
    public void _first_sentence_is_set_to(String firstInputSentence) {
        firstSentence = firstInputSentence;
    }
    @When("^first occurrence of symbol ([.?!:]) is removed$")
    public void first_occurrence_of_symbol_is_removed(String exclamationMark) {
        firstSentence = firstSentence.replaceFirst(exclamationMark,"");
        System.out.println("Updated first sentence: " + firstSentence);
    }
    @Given("_Second sentence is set to: {string}")
    public void _second_sentence_is_set_to(String secondInputSentence) {

        secondSentence = secondInputSentence;
    }
    @When("^all occurrences of symbol ([“\\(\\)\\[\\],;\\-']) is removed$") // java.util.regex.PatternSyntaxException: Unclosed group near index 1
    public void all_occurrences_of_symbols_and_are_removed(String symbol) {
        firstSentence = firstSentence.replaceAll(symbol, "");
        System.out.println("Updated second sentence: " + firstSentence);
    }

    @Then("check the equality of _First sentence and _Second sentence")
    public void check_the_equality_of__first_sentence_and__second_sentence() {
        System.out.printf("Comparing %s with %s%n", firstSentence, secondSentence);
        assertEquals(firstSentence, secondSentence, "The sentences are not the same!");
//        assertTrue(StringHelper.compareWords(firstSentence,secondSentence,isCaseSensitive), "The sentences are not the same!");
    }

    @Given("the input is a paragraph of text")
    public void the_input_is_a_paragraph_of_text(String docString) {
        inputText = docString;
    }

    @Then("print the word count")
    public void printTheWordCount() {
        System.out.println("The total wordcount is: " + stringHelper.countWords(inputText));
    }

    @Given("case sensitivity is set to {booleanValue}")
    public void case_sensitivity_is_set_to(Boolean bool) {
        isCaseSensitive = bool;
    }
}
