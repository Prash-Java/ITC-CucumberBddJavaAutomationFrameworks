package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

//@RunWith(Cucumber.class)    //optional automation
public class HomeStepDefs {
//    @Before
//    public void setUp(){
//        System.out.println("Before Test Case");
//    }
//    @After
//    public void tearDown(){
//        System.out.println("After Test Case");
//    }
    @Given("^Launch url which is expected to be hit on custom browser$")
    public void launchUrlWhichIsExpectedToBeHitOnCustomBrowser() {
        System.out.println("Cucumber BDD Frameworks");
    }

    @When("^User launches url and verifies header text presence$")
    public void userLaunchesUrlAndVerifiesHeaderTextPresence() {
        System.out.println("Cucumber BDD Frameworks");
    }
    @Then("^User verifies login and password fields are present on screen$")
    public void userVerifiesLoginAndPasswordFieldsArePresentOnScreen() {
        System.out.println("Cucumber BDD Frameworks");
    }
    @And("^User Closes the instance of browser and comes out of application$")
    public void userClosesTheInstanceOfBrowserAndComesOutOfApplication() {
        System.out.println("Cucumber BDD Frameworks");
    }

    @Then("^User will verify \"([^\"]*)\" and \"([^\"]*)\" fields are present on screen$")
    public void userVerifiesLoginAndPasswordFieldsArePresentOnScreen(String login, String password) {
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
    }

    @Then("^User will need verify \"(.*)\" and \"(.*)\" fields are present on screen$")
    public void userWillNeedVerifyAndFieldsArePresentOnScreen(String login, String password) {
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
    }

    @Then("^User will verify credentials fields are present on screen$")
    public void userWillVerifyCredentialsFieldsArePresentOnScreen(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        for(int i=0;i<data.size();i++){
            System.out.println("Value: " + data.get(i));
        }
    }

    @Then("^User will verify credentials fields are present on screen navigation$")
    public void userWillVerifyCredentialsFieldsArePresentOnScreenNavigation(DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
        for(int i=0;i< data.size();i++){
            System.out.println("Keys: " + data.get(i).get("login"));
            System.out.println("Values: " + data.get(i).get("password"));
        }
    }
}
