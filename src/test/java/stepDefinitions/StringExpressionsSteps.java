package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StringExpressionsSteps {

    private String inputWord;
    private boolean isCaseSensitive;

    @Given("user inputs the word {string}")
    public void user_inputs_the_word(String inputString) {
        inputWord = inputString;
    }

    @When("the letter {string} is removed")
    public void the_letter_is_removed(String letter) {

        inputWord = inputWord.replace(letter, "");
    }

    @Then("verify the result is {string}")
    public void the_result_is(String finalResult) {

        System.out.println("Updated word: " + inputWord);
        Assert.assertTrue(StringHelper.compareWords(inputWord,finalResult,isCaseSensitive));
    }

}
