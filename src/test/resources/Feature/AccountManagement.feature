@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create Using A Valid Email Address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My Account page is displayed

    Examples:
      | FirstName | LastName | Email                 | Password | ConfirmPassword |
      | Didi      | Ray      | Didi-ray340@gmail.com | Dada@123 | Dada@123        |

  @DuplicateAccount
  Scenario Outline: Duplicate Account Not Allowed
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then Account already exist should displayed

    Examples:
      | FirstName | LastName | Email                 | Password | ConfirmPassword |
      | Dada      | Raya     | Didi-ray330@gmail.com | Didi@123 | Didi@123        |

  @AccountLogin
  Scenario Outline: Customer To Login With Their Registered Username And Password
    Given I am on Login page
    When I enter "<Email>" "<Password>"
    And I click sign in
    Then My dashboard is displayed

    Examples:
      | Email                 | Password |
      | Didi-ray340@gmail.com | Dada@123 |

  @UpdateCustomerDetails
  Scenario Outline: Customer to be able to update password from account dashboard
    Given I am on Login page
    When I enter "<Email>" "<Password>"
    And I click sign in
    And I click on dashboard
    And I click on my account
    And I click change password
    When I enter "<CurrentPassword>" "<NewPassword>" "<ConfirmNewPassword>"
    And I click save
    Then My password should be Updated successfully


    Examples:
      | Email                 | Password | CurrentPassword | NewPassword | ConfirmNewPassword |
      | Didi-ray340@gmail.com | Dada@123 | Dada@123        | Testing123@ | Testing123@     |


  @AccountLock
  Scenario Outline: Customer account to be locked after 5 attempt of incorrect password





