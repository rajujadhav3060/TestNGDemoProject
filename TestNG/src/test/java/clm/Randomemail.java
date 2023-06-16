package clm;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Randomemail {

	public static void main(String[] args) {

		Randomemail rd = new Randomemail();

		rd.randomaccessDemo();

	}

	public void randomaccessDemo() {

		Random randomGenerator = new Random();

		int randomInt = randomGenerator.nextInt(1000);

		String generatedstring = RandomStringUtils.randomAlphabetic(5);

		String	email_id = (generatedstring + randomInt + "@yopmail.com");
		
		System.out.println(email_id);

	}

}
