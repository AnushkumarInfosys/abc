package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runner {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.worldometers.info/coronavirus/country/uk");
		  //print corona cases
		  String cc = driver.findElement(By.xpath("//div[@class='maincounter-number']//span")).getText();
		  System.out.println(cc);
	}
	}



