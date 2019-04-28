Meta:

Narrative:
As a user I want to be able to apply for an open position on careers page

Meta:
@driver chrome
Scenario: Apply for a job positive scenario
Given Customer is on the Hexad main page
And Customer navigates to Careers page
When Customer clicks on 'Apply now' for a position
Then Customer is redirected to an 'Careers Apply' page
And Customer is able to apply for a position with next data:
|title   |fullName    |        address          |           email    |     phone          |   position     |    jobType |
|  Mr.   |  Test      | Wolfsburg , Germany     |  test@gmail.com    |  +49123455678      |   UI Developer | Part-Time  |


Meta:
@skip @driver chrome
Scenario: Apply for a job negative scenario, missing adress
Given Customer is on the Hexad main page
And Customer navigates to Careers page
When Customer clicks on 'Apply now' for a position
Then Customer is redirected to an 'Careers Apply' page
And Customer is able to apply for a position with next data:
|title   |fullName    |        address          |           email    |     phone          |   position     |    jobType |
|  Mr.   |  Test      |    Wolfsburg , Germany  |  test@gmail.com    |  +49123455678      |   UI Developer | Part-Time  |

Meta:
@skip @driver chrome
Scenario: Apply for a job negative scenario, missing jobType
Given Customer is on the Hexad main page
And Customer navigates to Careers page
When Customer clicks on 'Apply now' for a position
Then Customer is redirected to an 'Careers Apply' page
And Customer is able to apply for a position with next data:
|title   |fullName    |        address          |           email    |     phone          |   position     |    jobType |
|  Mr.   |  Test      | Wolfsburg , Germany     |  test@gmail.com    |  +49123455678      |   UI Developer |            |

Meta:
@skip @driver chrome
Scenario: Apply for a job negative scenario, missing email
Given Customer is on the Hexad main page
And Customer navigates to Careers page
When Customer clicks on 'Apply now' for a position
Then Customer is redirected to an 'Careers Apply' page
And Customer is able to apply for a position with next data:
|title   |fullName    |        address          |           email    |     phone          |   position     |    jobType |
|  Mr.   |  Test      |     Wolfsburg , Germany |                    |  +49123455678      |   UI Developer |  Full-Time |