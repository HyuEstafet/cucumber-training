package stepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class NumericExpressionsDataTableSteps {

    private ArrayList<Integer> listOfNumbers;
    private ArrayList <Integer> calculatedResult;
    private List<Integer> positiveNumbers = new ArrayList<>();
    private List<Integer> negativeNumbers = new ArrayList<>();
    int sumOfPositives;
    int sumOfNegatives;
    int differenceOfPositives;
    int differenceOfNegatives;

    @ParameterType("sum|difference")
    public String operation(String operation) {
        return operation;
    }

    @Given("we have the following numbers:")
    public void weHaveTheFollowingNumbers(List<List<Integer>> rows) {

        positiveNumbers.add(rows.get(0).get(0));
        positiveNumbers.add(rows.get(1).get(0));
        negativeNumbers.add(rows.get(0).get(1));
        negativeNumbers.add(rows.get(1).get(1));

        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Negative Numbers: " + negativeNumbers);
    }

    @When("we use operator {operation}")
    public void weUseOperatorSumOrDifference(String operation) {
        if (operation.equals("sum")) {
            sumOfPositives=positiveNumbers.get(0) + positiveNumbers.get(1);
            sumOfNegatives=negativeNumbers.get(0) + negativeNumbers.get(1);
            System.out.println("Sum of positives: " + sumOfPositives+"\n"+"Sum of negatives: "+sumOfNegatives);
        } else if (operation.equals("difference")) {
            differenceOfPositives=positiveNumbers.get(0)-positiveNumbers.get(1);
            differenceOfNegatives=negativeNumbers.get(0)-negativeNumbers.get(1);
            System.out.println("Difference of positives: " +differenceOfPositives+"\n"+"Difference of negatives: "+differenceOfNegatives);
        } else {
            System.out.println("Invalid operation!");
        }
    }
    @Then("we print the results and compare")
    public void wePrintTheResults() {

        System.out.println(sumOfPositives==sumOfNegatives ?
                "Sum of positives and negatives is equal" : (sumOfPositives>sumOfNegatives ?
                "Sum of positives is greater: " +sumOfPositives : "Sum of negatives is greater: " + sumOfNegatives));
        System.out.println(differenceOfPositives==differenceOfNegatives ?
                "Difference of positives and negatives is equal" : (differenceOfPositives>differenceOfNegatives ?
                "Difference of positives is greater: " +differenceOfPositives : "Difference of negatives is greater: " + differenceOfNegatives));
    }

}
