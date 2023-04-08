package Sony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que1 {
//Go to google page,type your name in text field and sort the names in ascending order and fetch the element in 3rd index

	public static void main(String[] args)  throws Exception{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
        WebElement tf = d.findElement(By.name("q"));
        tf.sendKeys("kartik");
        Thread.sleep(2000);String t=null;
        ArrayList<String> a=new ArrayList<String>();
        List<WebElement> els = d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::span[1]"));
        for(WebElement el:els) {
        	t=el.getText();
        	a.add(t);
        }
        Collections.sort(a);
        System.out.println(a);
        System.out.println(d.findElement(By.xpath("//div[@jscontroller='vZr2rb']")).getText());
        d.quit();
	}

}
