package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GherkinSyntaxSteps {

    private List<String> studentsList;

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("The user is on the homepage");
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_user_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user inserts a {string}")
    public void user_inserts_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user presses the user login button")
    public void user_presses_the_user_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user inserts an invalid {string}")
    public void user_inserts_an_invalid(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("fails to login")
    public void fails_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user enters payroll number number as {string}")
    public void user_enters_payroll_number_number_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters firstname as {string} and lastname as {string}")
    public void user_enters_firstname_as_and_lastname_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters address {string}")
    public void user_enters_address(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters phoneNumber {string}")
    public void user_enters_phone_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters email {string}")
    public void user_enters_email(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on the register button and see the success message as {string}")
    public void user_clicks_on_the_register_button_and_see_the_success_message_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user enters {string} number")
    public void user_enters_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters {string}")
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters optional data {string}")
    public void user_enters_optional_data(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on the register button and see the success message")
    public void user_clicks_on_the_register_button_and_see_the_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
//    @Given("print the below students list")
//    public void we_have_the_below_students_list(DataTable table) {
//        List <String> data = table.asList();
//        System.out.println("List of students:");
//        System.out.println(data.get(0));
//        System.out.println(data.get(1));
//        System.out.println(data.get(2));
//        System.out.println(data.get(3));
//        System.out.println(data.get(4));
//    }
        @Given("print the below students list")
    public void we_have_the_below_students_list(List<String> studentsList) {
        this.studentsList=studentsList;
            System.out.println("All students: "+"\n" +this.studentsList);
        }


    @Given("we have the below shopping data:")
    public void we_have_the_below_shopping_data(DataTable dataTable) {
        List <List<String>> shoppingData = dataTable.asLists();
        System.out.println(shoppingData.get(0).get(0));

    }

    @Then("print all the items and quantity needed, group by the store name")
    public void print_all_the_items_and_qunatitiy_needed_groud_by_the_store_name() {

    }

}