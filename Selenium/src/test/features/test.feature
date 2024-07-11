@mts
Feature: Pay MTS

  @success
  Scenario Outline: Check pay requisites
    Given Open site
    And Agree cockle
    And Enter phone <phone>
    And Enter summ <sum>
    And Enter email <email>
    When Click button next
    Then Switch To Frame
    And Check number <phone>
    And Check amount text <sum>
    And Check amount button <sum>
       Examples:
      | email        | phone       | sum      |
      | "a@a.ru"     | "297777777" | "300.00" |
