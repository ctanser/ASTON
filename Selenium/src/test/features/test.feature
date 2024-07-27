@mts
Feature: Pay MTS

  @success
  Scenario Outline: Check pay requisites
    Given open mts.by
    And press button with text "Принять"
    And type to input with id "connection-phone" text: <phone>
    And type to input with id "connection-sum" text: <sum>
    And type to input with id "connection-email" text: <email>
    When press button with text "Продолжить"
    Then Switch To Frame 1
    And check with xpath "//div[@class='pay-description__text']/span" text: "Оплата: Услуги связи Номер:375"<phone>
    And check with xpath "//div[@class='pay-description__cost']/span" text: <sum>" BYN"
    And check with xpath "//div[@class='card-page__card']/button" text: "Оплатить "<sum>" BYN"
       Examples:
      | email        | phone       | sum      |
      | "a@a.ru"     | "297777777" | "300.00" |
