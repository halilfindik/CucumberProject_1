#Senaryo 1| Register Functionality
# Para Bank sitesinde bir hesap açınız
# Hesabın açıldığını “Your account was created successfully. You are now logged in.” mesajını doğrulayınız.

Feature: Register Functionality

  Scenario: Register a new account

    Given Navigate to ParaBank
    When Create a new Account
    Then User should create a new account successfully