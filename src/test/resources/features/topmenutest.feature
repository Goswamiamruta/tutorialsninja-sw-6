@regression
Feature: Top Menu Functionality
  As a user I want to explore the top menu tab

  @author_Amruta @sanity @smoke @regression
  Scenario: Verify user should navigate to Desktops Page successfully
    Given I am on the homepage
    When  I mouse hover on Desktops tab and click on it
    And   I select Show All Desktops from Drop down
    Then  I can see the text "Desktops" desktop

  @author_Amruta @smoke @regression
  Scenario: Verify user should navigate to Laptops and Notebooks Page successfully
    Given I am on the homepage
    When  I mouse hover on Laptops and Notebooks tab and click on it
    And   I select Show All Laptops and Notebooks from Drop down
    Then  I can see the text "Laptops & Notebooks" laptop and notebook

  @author_Amruta @regression
  Scenario: Verify user should navigate to Components Page successfully
    Given I am on the homepage
    When  I mouse hover on Components tab and click on it
    And   I select Show All Components from Drop down
    Then  I can see the text "Components" components