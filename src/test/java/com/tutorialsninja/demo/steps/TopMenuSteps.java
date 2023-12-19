package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopMenuSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I mouse hover on Desktops tab and click on it")
    public void iMouseHoverOnDesktopsTabAndClickOnIt() {
        new TopMenuPage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("I select Show All Desktops from Drop down")
    public void iSelectShowAllDesktopsFromDropDown() {
        new DesktopsPage().clickOnShowAllDesktops();
    }

    @Then("I can see the text {string} desktop")
    public void iCanSeeTheTextDesktop(String value) {
        new TopMenuPage().getDesktopsText();
    }

    @When("I mouse hover on Laptops and Notebooks tab and click on it")
    public void iMouseHoverOnLaptopsAndNotebooksTabAndClickOnIt() {
        new TopMenuPage().mouseHoverOnLaptopAndNotebooksLinkAndClick();
    }

    @And("I select Show All Laptops and Notebooks from Drop down")
    public void iSelectShowAllLaptopsAndNotebooksFromDropDown() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();

    }

    @Then("I can see the text {string} laptop and notebook")
    public void iCanSeeTheTextLaptopAndNotebook(String value) {
        new TopMenuPage().getLaptopsAndNotebooksText();
    }

    @When("I mouse hover on Components tab and click on it")
    public void iMouseHoverOnComponentsTabAndClickOnIt() {
        new TopMenuPage().mouseHoverOnComponentsLinkAndClick();
    }

    @And("I select Show All Components from Drop down")
    public void iSelectShowAllComponentsFromDropDown() {
    }

    @Then("I can see the text {string} components")
    public void iCanSeeTheTextComponents(String value) {
        new TopMenuPage().getComponentsText();
    }
}
