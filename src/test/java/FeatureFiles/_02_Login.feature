Feature:Login Functionality

  As a user , when i enter valid credentials , i should be able to login successfully,
  when I enter invalid credentials i should not be able to login

  Background:
    Given Navigate to Para bank website


  Scenario Outline:1
    Given Enter username as a"<Username>" enter as a "<Password>"
    And  click the login button
    And Confirm that Login step is unsuccessful

    Examples:
      | Username  | Password  |
      | brck      | 565466664 |
      | sdsdsddsd | 123       |
      | sdsdsdds  | sdfdfdfdf |
      |           | 123       |
      | ahmet8    |           |
      |           |           |
    Scenario Outline:2
      And Enter username as a"<Username>" enter as a "<Password>"
      And click the login button
      And Confirm that Login Step is Successfull

      Examples:
        | Username |Password|
        | brck     | 123    |

