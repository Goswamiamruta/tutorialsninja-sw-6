package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LaptopsAndNotebooksSteps {

    @And("I hover on Laptops & Notebooks Tab and click")
    public void iHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNotebooksPage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("I click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @And("I select Sort By {string}")
    public void iSelectSortBy(String value) {
        new LaptopsAndNotebooksPage().PriceHighToLow();
    }

    @Then("I can see the Product price will arrange in High to Low order.")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().selectPriceHighToLow();
    }

    @And("I select Product {string}")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().clickOnMacBook();
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextMacBook() {
        new LaptopsAndNotebooksPage().getMacBookText();
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new LaptopsAndNotebooksPage().clickOnAddOnCart();
    }

    @Then("I can see the message {string}")
    public void iCanSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        new LaptopsAndNotebooksPage().getSuccessShoppingText();
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new LaptopsAndNotebooksPage().clickOnShoppingCart();
    }

    @Then("I can able to see the text {string}")
    public void iCanAbleToSeeTheText(String value) {
        new LaptopsAndNotebooksPage().getSuccessShoppingText();
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String value) {
        new LaptopsAndNotebooksPage().getMacBookText1();
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(int value) {
        new LaptopsAndNotebooksPage().clearAndAddQuantity("2");
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab() {
        new LaptopsAndNotebooksPage().clickOnUpdate();
    }

    @Then("I can see the Total £{double}")
    public void iCanSeeTheTotal£(int value, int value1) {
        new LaptopsAndNotebooksPage().getTotalText();
    }

    @And("I click on {string} button")
    public void iClickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickOnCheckOut();
    }

    @Then("I can see the Text {string}")
    public void iCanSeeTheTextNewCustomer() {
        new LaptopsAndNotebooksPage().getNewCustomerText();
    }

    @And("I click on {string} radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().getGuestCheckoutText();
    }

    @And("I click on {string} tab")
    public void iClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
    }

    @And("I click on {string} Button")
    public void iClickOnContinueButton() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("I add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNotebooksPage().enterComments("Yes");
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new LaptopsAndNotebooksPage().clickOnAgree();
    }

    @And("I click on new customer continue button")
    public void iClickOnNewCustomerContinueButton() {
        new LaptopsAndNotebooksPage().clickOnGuestContinue();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String value) {
        new LaptopsAndNotebooksPage().enterFirstName("Abc");

    }

    @And("I enter last name {string}")
    public void iEnterLastName(String value) {
        new LaptopsAndNotebooksPage().enterLastName("Xyz");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String value) {
        new LaptopsAndNotebooksPage().enterEmail("test123z@gmail.com");
    }

    @And("I enter phone no {string}")
    public void iEnterPhoneNo(String value) {
        new LaptopsAndNotebooksPage().enterPhoneNumber("0987654321");
    }

    @And("I enter Address {string}")
    public void iEnterAddress(String value) {
        new LaptopsAndNotebooksPage().enterAddress1("449A kingstone");
    }

    @And("I enter city name {string}")
    public void iEnterCityName(String value) {
        new LaptopsAndNotebooksPage().enterCity("London");
    }

    @And("I enter postcode {string}")
    public void iEnterPostcode(String value) {
        new LaptopsAndNotebooksPage().enterPostCode("KT190DB");
    }

    @And("I select Country {string} from drop down")
    public void iSelectCountryFromDropDown(String value) {
        new LaptopsAndNotebooksPage().selectCountry("United Kingdom");
    }

    @And("I select Region {string} from drop down")
    public void iSelectRegionFromDropDown(String value) {
        new LaptopsAndNotebooksPage().selectRegion("Hindu");
    }

    @And("I click on the Continue as Guest button")
    public void iClickOnTheContinueAsGuestButton() {
        new LaptopsAndNotebooksPage().clickOnGuestContinue();

    }

    @And("I add comments about the order {string}")
    public void iAddCommentsAboutTheOrder(String value) {
        new LaptopsAndNotebooksPage().enterComments("Thank you");
    }

    @And("I click on Terms and conditions check box")
    public void iClickOnTermsAndConditionsCheckBox() {
        new LaptopsAndNotebooksPage().clickOnCheckOut();
    }

    @And("I click on continue button to proceed to payment")
    public void iClickOnContinueButtonToProceedToPayment() {
        new LaptopsAndNotebooksPage().clickOnLastContinueCheckOutButton();
    }

    @Then("I get payment warning message {string}")
    public void iGetPaymentWarningMessage(String value) {
        new LaptopsAndNotebooksPage().verifyPaymentWarningText();
    }
}