package com.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	WebDriver driver = null;
	
	@FindBy(tagName = "tr")
	private List<WebElement> rows;
	
	public UsersPage(WebDriver driver) {
	this.driver = driver	;
	PageFactory.initElements(driver, this);
	}
	
	/*public void printRows() {
	
		List<WebElement> data = null;
		for(WebElement row : rows ) {
			
			//System.out.println(row.getText());
			
			if (rows.indexOf(row)==0)
				data = row.findElements(By.tagName("th"));
			else
				data = row.findElements(By.tagName("td"));
			
			for(WebElement value : data){
				System.out.print(value.getText()+" ");
			}
			System.out.println();
		}
	}
	
	public void verifyGender() {
		 List<WebElement> usernames = driver.findElements(By.xpath("//td[2]"));
		 List<WebElement> genders = driver.findElements(By.xpath("//td[6]"));
		 
		 HashMap<Integer, List<String>> exphm = new HashMap<Integer, List<String>>();
		 HashMap<Integer, List<String>> acthm = new HashMap<Integer, List<String>>();
		 
		 for(int i=0; i<usernames.size() ; i++ ) {
			 String uname = usernames.get(i).getText();
			 String gender = genders.get(i).getText();
			 
			 List<String> al = new ArrayList<String>();
			 al.add(uname);
			 al.add(gender);
			 
			 acthm.put(i, al);
		 }
		 
		 for(int j=1; j<=4; j++ ) {
			 String uname = getCellData(j,1);
			 String gender = getCellData(j,5);
			 
			 List<String> al = new ArrayList<String>();
			 al.add(uname);
			 al.add(gender);
			 
			 exphm.put(j-1, al);
	}
  } */
}
