Feature: Application Login
@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "Rishabh" and "1234"
Then Home page is populated
And Cards are displayed "true"

@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "John" and "2345"
Then Home page is populated
And Cards are displayed "false"

@SanityTest @RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "John" and "2345"
Then Home page is populated
And Cards are displayed "false"

@SanityTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "John" and "2345"
Then Home page is populated
And Cards are displayed "false"