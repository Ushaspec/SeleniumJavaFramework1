Feature: : Login Testpage
  @New1
  Scenario: : Valid Login
    Given User launches the browser
    When User enter username and Password


  @New2
  Scenario: InValid Login
    Given User launches the browser
    When User enter incorrect username and Password
    And User enter submit button
    Then User getting error "Your password is invalid!"

  @New3
  Scenario: User play JavaScript scenario
    Given User launches the new testing browser
    When User navigate to Java script delay button
    And User able to click on Start button
    Then Count down should complete "Liftoff!"

  @New4
  Scenario: User play form field
    Given User launches the new testing browser
    When User enter Form field
    And User able to enter all details
    And User able to submit the form

  @New5
  Scenario: user play popups
    Given User launches the new testing browser
    When User enter popups button
    And user enter alert popup
    And user enter confirm popup
    And user enter prompt popup

  @New6
  Scenario: User play sliders
    Given User launches the new testing browser scroll
    When User enter sliders button

  @New7
  Scenario: User try calendar
    Given User launches the new testing browser scroll
    When User enter last year date

  @New8
  Scenario:Modal buttons
    Given User launches the new testing browser scroll
    When User enter Modals button
    When user enter form modal

  @New9
  Scenario: Window Operations
    Given User launches the new testing browser scroll
    When User enter window operations
    And User navigate to replace window
    And user enter new window

  @New10
  Scenario: Hover
    Given User launches the new testing browser scroll
    When User enter Hover button

  @New11
  Scenario: Tables
    Given User launches the new testing browser scroll
    When Count number of rows and columns
    And Extract all data from the table
    And user searches for "Marbles" in the table
    And Verify the table headers

  @New12
  Scenario: Accordions
    Given User launches the new testing browser scroll end
    When user enter Accordions
    And user click on accordions
    Then able to see "This is an accordion item."

  @New13
  Scenario: Brokenlink
    Given User launches the new testing browser scroll BI
    When User click on broken link
    Then User checks all links for broken ones

  @New14
  Scenario: Broken images
    Given User launches the new testing browser scroll BI
    When User click on broken image
    Then User verifies all images for broken ones

  @New15
  Scenario: Ads
    Given User launches the new testing browser scroll Ads
    When User click on ads
    Then Ads page should be displayed

  @New16
  Scenario: Gesture
    Given User launches the new testing browser scroll Ads
    When User click on Gesture
    When user perform drag and drop
    When place in target place
    When drag the map anywhere

  @New17
  Scenario: Download file
    Given User launches the new testing browser scroll Ads
    When User click on File download option


  @New18
  Scenario: Upload file
    Given User launches the new testing browser scroll Ads
    When User click on upload file option

  @New19
  Scenario: Spinner
    Given User launches the new testing browser scroll Ads
    When User triggers the loading spinner
    Then Spinner should be displayed
    And Spinner should disappear after loading completes

  @New20
  Scenario: iframe
    Given User launches the new testing browser scroll BI
    When  user click on Get Started in iframe















































