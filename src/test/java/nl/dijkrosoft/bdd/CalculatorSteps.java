package nl.dijkrosoft.bdd;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.dijkrosoft.Calculator;
import org.junit.Assert;

/**
 * Created by dickdijk on 01/11/16.
 */
public class CalculatorSteps {

    Calculator calculator = new Calculator();

    @Given("^a number (\\d+)$")
    public void a_number(int arg1) throws Throwable {
        calculator.add(arg1);
    }

    @Given("^another number (\\d+)$")
    public void another_number(int arg1) throws Throwable {
        calculator.add(arg1);
    }

    @When("^the user adds them$")
    public void the_user_adds_them() throws Throwable {
        calculator.calculateSum();
    }

    @Then("^the calculator shows the result (\\d+)$")
    public void the_calculator_shows_the_result(int arg1) throws Throwable {
        Assert.assertEquals(arg1, calculator.getResult(), 0.1);
    }

    @When("^the user subtracts them$")
    public void the_user_subtracts_them() throws Throwable {
        calculator.calculateDifference();
    }
}
