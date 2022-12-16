Feature: Search by keyword

  Scenario Outline: Login
    Given que zair esta en la pagina
    When  realizo login
      | user   | pass   |
      | <USER> | <PASS> |
    Then  valido que el usuario  ingreso de manera Exitosa
    Examples:
      | USER          | PASS         |
      | standard_user | secret_sauce |





