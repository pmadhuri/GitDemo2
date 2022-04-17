Feature: Login
Scenario: Login Functionality
Given User is an netBanking page
When User log into Applicationwith username as "nmm" and password as "1233"
Then Home Page is populated
And cards are displayed