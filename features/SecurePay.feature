Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Search securepay and click the homepage link
    Given I open chrome browser
    And I searched Securepay in searchbar
    When I press Enter key
	  Then I should see Securepay results
    And I click on the First result to see the Securepay homepage
    And I assert the page title
    
  Scenario: Navigating to Contact Us page
  Given I open chrome browser and navigate to securepay
  When I click support link in menu
  Then I click Contact Us link
  
  Scenario: Entering random data in Contact Us page Fields
  Given I open chrome browser and navigate to contactUs page
 When click first name and enter random text
	Then click last Name and enter random text
	And click email and enter random emailID
	Then click phone number and enter random number
	And click website URL and enter random text
	And click company name and enter random text
	

	