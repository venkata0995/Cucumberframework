package Stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

import java.util.List;

public class Mystepdef
{
    @Given("^User is on NetBanking landing Page$")
    public void user_is_on_netbanking_landing_page() throws Throwable
    {
        System.out.println("page opened");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable
    {
        System.out.println("logged into application");
    }

    @Then("^Home Page is Populated$")
    public void home_page_is_populated() throws Throwable
    {
        System.out.println("page is navigated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable
    {
        System.out.println("cards are displayed");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable
    {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable
    {
        System.out.println(strArg1);
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable
    {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));

    }
    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable
    {
        System.out.println(username);
        System.out.println(password);
    }
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable
    {
        System.out.println("deciding browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable
    {
        System.out.println("Browser is triggered");
    }

    @Then("^Browser is started$")
    public void browser_is_started() throws Throwable
    {
        System.out.println("Browser is started");
    }

}
