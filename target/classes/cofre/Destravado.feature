# language: en
# Source: http://github.com/aslakhellesoy/cucumber/blob/master/examples/i18n/en/features/addition.feature
# Updated: Tue May 25 15:51:43 +0200 2010
Feature: Testa

  Scenario: Inicializa
    Given que o cofre esta destravado
    Then deve retornar "Entre com a senha 6 digitos"

  Scenario: Limpa campos
    Given pressionei Limpar
    Then retorna ""

  Scenario Outline: Testa porta fechada
    Given que pressionei <numero>
    And a porta esta fechada
    Then retorna a <saida>

    Examples: 
      | numero | saida                                    |
      | 0      | "Feche a porta antes de digitar a senha" |
      | 1      | "Feche a porta antes de digitar a senha" |
      | 2      | "Feche a porta antes de digitar a senha" |
      | 3      | "Feche a porta antes de digitar a senha" |
      | 4      | "Feche a porta antes de digitar a senha" |
      | 5      | "Feche a porta antes de digitar a senha" |
      | 6      | "Feche a porta antes de digitar a senha" |
      | 7      | "Feche a porta antes de digitar a senha" |
      | 8      | "Feche a porta antes de digitar a senha" |
      | 9      | "Feche a porta antes de digitar a senha" |

 Scenario Outline: Testa porta fechada
    Given a porta continua fechada
    And que apertei <numero>
    Then retorna a <saida>
 Examples: 
      | numero | saida |
      | "0"    | "0"   |
      | "1"    | "1"   |
      | "2"    | "2"   |
      | "3"    | "3"   |
      | "4"    | "4"   |
      | "5"    | "5"   |
      | "6"    | "6"   |
      | "7"    | "7"   |
      | "8"    | "8"   |
      | "9"    | "9"   |
      