package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Runner.RunnerClassAdactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClassAdactin.driver;
	
	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The User_name In User_name Field$")
	public void user_Enter_The_User_name_In_User_name_Field() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("balajinammazhwar");
	}
	

	@When("^user Enter The Password in Password Field$")
	public void user_Enter_The_Password_in_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("priyabala89");
		
	}

	@Then("^user Click the Login Button And It Navigates Search Hotel Page$")
	public void user_Click_the_Login_Button_And_It_Navigates_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
		
	}
	@Given("^user Login In The Adactin Application$")
	public void user_Login_In_The_Adactin_Application() throws Throwable {
	}

	@When("^user Select Location$")
	public void user_Select_Location() throws Throwable {
		WebElement loca = driver.findElement(By.id("location"));
		Select s= new Select(loca);
		s.selectByVisibleText("Sydney");
	}

	@When("^user Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		WebElement sh = driver.findElement(By.id("hotels"));
		Select s1= new Select(sh);
		s1.selectByVisibleText("Hotel Creek");
		
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
WebElement sr = driver.findElement(By.id("room_type"));
Select s2= new Select(sr);
s2.selectByVisibleText("Double");
	}

	@When("^user Select No Of Rooms$")
	public void user_Select_No_Of_Rooms() throws Throwable {
		WebElement nr = driver.findElement(By.id("room_nos"));
		Select s3= new Select(nr);
		s3.selectByVisibleText("1 - One");
	}

	@When("^user Select Check In Date$")
	public void user_Select_Check_In_Date() throws Throwable {
		
	}

	@When("^user Select Check Out Date$")
	public void user_Select_Check_Out_Date() throws Throwable {
	}
	
	
	@When("^user Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
		WebElement apr = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(apr);
		s5.selectByVisibleText("2 - Two");
	}

	@When("^user Select Childrens Per Room$")
	public void user_Select_Childrens_Per_Room() throws Throwable {
		WebElement cpr = driver.findElement(By.id("child_room"));
		Select s6 = new Select(cpr);
		s6.selectByVisibleText("2 - Two");
	}

	@Then("^user Click the Search Button$")
	public void user_Click_the_Search_Button() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@Given("^user Searched the Hotel In Adactin Application$")
	public void user_Searched_the_Hotel_In_Adactin_Application() throws Throwable {
}
	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user Click The Continue Button$")
	public void user_Click_The_Continue_Button() throws Throwable {
		driver.findElement(By.id("continue")).click();
}
	@Given("^user Selected the Hotel In Adactin Application$")
	public void user_Selected_the_Hotel_In_Adactin_Application() throws Throwable {
		
	}

	@When("^user Enter the First name in First Name Field$")
	public void user_Enter_the_First_name_in_First_Name_Field() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("Balaji");
	}

	@When("^user Enter the Last Name In Last Name Field$")
	public void user_Enter_the_Last_Name_In_Last_Name_Field() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("Nammazhwar");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("Kundrathur, Chennai-128");
	}

	@When("^user Enter Credit Card Number in Card Number Field$")
	public void user_Enter_Credit_Card_Number_in_Card_Number_Field() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("1234567887456321");	
	}

	@When("^user Select Credit Card Type$")
	public void user_Select_Credit_Card_Type() throws Throwable {
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6= new Select(cctype);
		s6.selectByVisibleText("American Express");
	}

	@When("^user Select The Expiry Date Of Credit Card$")
	public void user_Select_The_Expiry_Date_Of_Credit_Card() throws Throwable {
		WebElement sm = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(sm);
		s7.selectByVisibleText("January");
		WebElement sy = driver.findElement(By.id("cc_exp_year"));
		Select s8= new Select(sy);
		s8.selectByVisibleText("2022");
	}

	@When("^user Enter The CVV Number in CVV Number Field$")
	public void user_Enter_The_CVV_Number_in_CVV_Number_Field() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("049");
				
	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
	}

	@Given("^user Booked The Hotel in Adactin Application$")
	public void user_Booked_The_Hotel_in_Adactin_Application() throws Throwable {
		
	}

	@When("^user Click Logout Button$")
	public void user_Click_Logout_Button() throws Throwable {
		driver.findElement(By.xpath("//a[@href='Logout.php']")).click();
	}

	@Then("^Application Navigates To Home Page$")
	public void application_Navigates_To_Home_Page() throws Throwable {
		
	}


	
	
	
}
