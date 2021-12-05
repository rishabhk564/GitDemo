Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@RegTest
Scenario Outline: Home page default login      
Given User is on landing page
When User login in to application with <username> and <password>
Then Home page is populated
And Cards are displayed "true"

Examples: 
|username|password|
|Rishabh |12347    |
|Risha   |1236    |
|Ris     |12347   |
|Ri      |12366   |



@SanityTest
Scenario: Home page default login
Given User is on landing page
When User signup with these details
| rishabhk889 | rishabh@hsg.com | India | 907997887887 | 
Then Home page is populated
And Cards are displayed "false"
