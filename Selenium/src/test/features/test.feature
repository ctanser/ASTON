@mts
Feature: Pay MTS

  @success
  Scenario Outline: Check pay requisites
    Given open mts.by
    And press button "Принять" on "Первая страница"
    And type to input "Phone" text: <phone>
    And type to input "Sum" text: <sum>
    And type to input "Email" text: <email>
    When press button "Продолжить" on "Вторая страница"
    Then Switch To Frame 1
    And check "Number iframe" text: "Оплата: Услуги связи Номер:375"<phone>
    And check "Sum iframe" text: <sum>" BYN"
    And check "Sum button iframe" text: "Оплатить "<sum>" BYN"
    Examples:
      | email    | phone       | sum      |
      | "a@a.ru" | "297777777" | "300.00" |
