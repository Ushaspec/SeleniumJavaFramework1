Feature: Login Testpage
  @New1
    Scenario: Valid Login
    Given User launches the browser
    When User enter username and Password
    And User enter submit button
    Then Product page should be logged in

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




































