# Senaryo 2| Login Functionality
# Para Bank sitesine geçerli kullanıcı bilgileriyle giriş yapınız ve Login olduğunuzu doğrulayınız
# Para Bank sitesine geçersiz kullanıcı bilgileriyle giriş yapınız ve login olmadığınızı #doğrulayınız.
# (Username ve password için ayrı ayrı deneyin)

Feature: Login Functionality

  Background:
    Given Navigate to ParaBank

  Scenario:
    When Login with a valid User name and Password
    Then Successfully login message should be displayed

  Scenario Outline:
    When Login with User name as "<InvalidUsername>" and password as "<InvalidPassword>"
    Then Invalid account message should be displayed

    Examples:
      | InvalidUsername   | InvalidPassword |
      | horasanlim        | nopredt124      |
      | morhasanlim       | nopredt124      |
      | morhasanlim       | abc123456       |