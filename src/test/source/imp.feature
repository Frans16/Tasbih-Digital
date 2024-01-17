Feature: IMP Tasbih Digital

  Scenario: Test tasbih digital function
  	Given User is on page
  	When User accumulate some counts on the Tasbih Digital
  	And Click button reset
  	Then has successfully reset the prayer beads count
