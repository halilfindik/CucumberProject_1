#Senaryo 3 | Bill Pay Functionality
# Bill Pay sayfasına gidiniz
# Elektrik (85), Su (45), Doğalgaz (120) faturalarını ödeyiniz
# NOT: Her fatura için farklı veri kullanınız.
# Her ödemeden sonra faturanın ödendiğini doğrulayınız

Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank
    And Login with a valid User name and Password
    And Navigate to Bill Pay Page

  Scenario Outline:
    When Pay "<Bill Type>" bills of "<Amount>"
    Then Success message should be displayed

    Examples:
      | Bill Type | Amount |
      | CK        | 45     |
      | ISKI      | 65     |
      | IGDAS     | 25     |