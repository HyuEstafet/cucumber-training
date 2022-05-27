package stepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class NumericExpressionsDataTableSteps {

    private List<Integer> positiveNumbers = new ArrayList<>();
    private List<Integer> negativeNumbers = new ArrayList<>();

    int calculationOfPositives = 0;
    int calculationOfNegatives = 0;
    String calculationType = "";

    @ParameterType("sum|difference")
    public String operation(String operation) {
        return operation;
    }

    @Given("we have the following numbers:")
    public void weHaveTheFollowingNumbers(List<List<Integer>> rows) {
        rows.forEach(column -> {
            positiveNumbers.add(column.get(0)); // positive numbers (3, 2)
            negativeNumbers.add(column.get(1)); // negative numbers (-1, -5)
        });


        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Negative Numbers: " + negativeNumbers);
    }

    @When("we use operator {operation}")
    public void weUseOperatorSumOrDifference(String operation) {

        calculationType = operation;
        System.out.println("Setting calculation type to: " + calculationType);

        if (operation.equals("sum")) {
            for (int n : positiveNumbers) {
                calculationOfPositives = calculationOfPositives + n;
            }
            negativeNumbers.forEach(number -> {
                calculationOfNegatives = calculationOfNegatives + number;
            });
        } else {
            for (int n : positiveNumbers) {
                calculationOfPositives = calculationOfPositives - n;
            }
            for (int n : negativeNumbers) {
                calculationOfNegatives = calculationOfNegatives - n;
            }
        }
        System.out.println("Positives calculations: " + calculationOfPositives);
        System.out.println("Negatives calculations: " + calculationOfNegatives);
    }


    @Then("we print the results and compare")
    public void wePrintTheResults() {
        System.out.println(
                calculationOfPositives == calculationOfNegatives ? "Calculations are equal!" :
                        (calculationOfPositives > calculationOfNegatives ? "Calculation of positives is greater: " + calculationOfPositives :
                                "Calculations of negatives is greater: " + calculationOfNegatives));
    }
}
