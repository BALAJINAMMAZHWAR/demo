Feature: Hotel Booking in Adactin Application
Scenario: User Login In The Web Application
Given user Launch the Adactin Application
When user Enter The User_name In User_name Field
And user Enter The Password in Password Field
Then user Click the Login Button And It Navigates Search Hotel Page

Scenario: Searching The Hotel In Adactin Application
Given user Login In The Adactin Application
When user Select Location
And user Select Hotel
And user Select Room Type
And user Select No Of Rooms
And user Select Check In Date
And user Select Check Out Date
And user Select Adults Per Room
And user Select Childrens Per Room
Then user Click the Search Button

Scenario: Selecting The Hotel in Adactin Application
Given user Searched the Hotel In Adactin Application
When user Select The Hotel
Then user Click The Continue Button

Scenario: Booking The Hotel In Adactin Application
Given user Selected the Hotel In Adactin Application
When user Enter the First name in First Name Field
And user Enter the Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter Credit Card Number in Card Number Field
And user Select Credit Card Type
And user Select The Expiry Date Of Credit Card
And user Enter The CVV Number in CVV Number Field
Then user Click The Book Now Button


Scenario: User Log Out Of The Application
Given user Booked The Hotel in Adactin Application
When user Click Logout Button
Then Application Navigates To Home Page 
