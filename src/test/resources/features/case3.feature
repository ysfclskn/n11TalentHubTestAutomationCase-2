Feature: n11 TalentHub Case 3

  @main
Scenario: List free shiping products
  Given I searches for "telefon"
  Then I should see list and I filter second brand
  And I sort list by comments
  And I sort products by free shpinig