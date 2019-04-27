Meta:

Narrative:
As a user I want to be able to apply for an open position on careers page

Meta:
@driver chrome
Scenario: Apply for a job
Given Customer is on the Hexad main page
And Customer navigates to Careers page
When Customer clicks on 'Apply now' for a position
Then Customer is redirected to an 'Careers Apply' page
And Customer is able to apply for a position with next data:
|title   |fullName    |        address          |           email    | phone              |   position     |    jobType |
|  Mr.   |  Test      | Wolfsburg , Germany     |  test@gmail.com    |  456789000         |   UI Developer | Part-Time  |