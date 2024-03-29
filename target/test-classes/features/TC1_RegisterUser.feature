Feature:
  Agile story: User should be able to register to the Automation Exercise application,
  as well as delete the account.


  @wip @UI
  Scenario Outline: User Registration to Account deletion flow
    Given User is on the Home page
    And User should be able to see Home Page
    When User clicks on the Signup Login button
    Then User should be able to see "New User Signup!" message on the page.
    When User enters "<name>" and "<email>" address
    And User clicks on the Signup button
    Then User can see "ENTER ACCOUNT INFORMATION" message
    When User enters title "<Title>"
    And User enters password "<password>"
    And User enters day of birth "<day>"
    And User enters month of birth "<month>"
    And User enters year of birth "<year>"
    And User selects checkbox "Receive special offers from our partners!"
    And User enters first name "<name>"
    And User enters last name "<Last name>"
    And User enters company "<Company>"
    And User enters address "<Address>"
    And User enters address 2 "<Address2>"
    And User enters country "<Country>"
    And User enters state "<State>"
    And User enters city "<City>"
    And User enters zip code "<Zipcode>"
    And User enters mobile phone "<Mobile phone>"
    And User clicks Create Account Button
    Then User should be able to see "ACCOUNT CREATED!" message
    When User clicks Continue button
    Then User should be able to see "Logged in as <name>"
    When User clicks on the Delete Account button
    Then User should be able to see "ACCOUNT DELETED!" message on the page
    Then User clicks Continue button.
    Then User should be able to see Home Page

    Examples:
      | name  | email                  | Title | password    | day | month | year | Last name | Company | Address     | Address2 | Country       | State   | City     | Zipcode | Mobile phone |
      | Ivana | ivna123455@gmail.com  | Mrs.  | password123 | 19  | July  | 1993 | Tune      | Amazon  | 1500 Bay Rd | 123      | United States | Florida | Miami    | 33139   | 305454845    |
      | Adam  | adm154831@hotmail.com | Mr.   | password123 | 21  | July  | 1988 | Park      | LIV     | Bay Park    | 5        | United States | Chicago | Illinois | 15451   | 234233432    |


