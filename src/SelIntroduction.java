

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Dimension d=new Dimension(300,650);
		driver.get("http://omayo.blogspot.com/");
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().setSize(d);
		driver.findElement(By.id("checkbox2")).click(); 
		//
		
		
		

	}

}
