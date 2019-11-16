package BaseTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Sampletable {
    static Scanner sc=new Scanner(System.in);
    public static void data()
    {
        System.out.println("Select the city name 1.Dubai/n 2.Mekka /n 3.Taipei /n 4.Shangai");
    }
    public static void main(String []args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-table/");
        data();
        int a=sc.nextInt();
//        List<WebElement> structure =driver.findElements(By.name("row"));
//        System.out.println(structure.size());
        switch (a)
        {
            case 1:
                WebElement structure1 =driver.findElement(By.xpath("(//th)[9]"));
                WebElement built1= driver.findElement(By.xpath("(//td)[5]"));
                System.out.println(structure1.getText());
                System.out.println(built1.getText());
                break;
            case 2:
                WebElement structure2 =driver.findElement(By.xpath("(//th)[10]"));
                WebElement built2= driver.findElement(By.xpath("(//td)[11]"));
                System.out.println(structure2.getText());
                System.out.println(built2.getText());
                break;
            case 3:
                WebElement structure3 =driver.findElement(By.xpath("(//th)[11]"));
                WebElement built3= driver.findElement(By.xpath("(//td)[17]"));
                System.out.println(structure3.getText());
                System.out.println(built3.getText());
                break;
            case 4:
                WebElement structure4 =driver.findElement(By.xpath("(//th)[12]"));
                WebElement built4= driver.findElement(By.xpath("(//td)[23]"));
                System.out.println(structure4.getText());
                System.out.println(built4.getText());
                break;


        }
    }

}