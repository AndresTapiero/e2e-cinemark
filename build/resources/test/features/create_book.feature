Feature: Create book

  @smoke @login
  Scenario: Select a movie successfully
    Given Andres close the location view and select movie
    Then I can see the view

