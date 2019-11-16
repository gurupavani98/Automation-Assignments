package BaseTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class Form {
    public static WebDriver driver;
    static Scanner sc = new Scanner(System.in);

    public static  void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
    }

    public  static void details()
    {
        System.out.println("Enter first name");
        System.out.println("Enter last name");
        System.out.println("Enter job title");
        System.out.println("Enter Highest School of Education");
        System.out.println("1. High school /n 2.College /n 3.Grad School ");
        System.out.println("Enter your sex");
        System.out.println("1.Male /n 2.Female /n 3.Prefer Not to Say ");
        System.out.println("Enter your years of experience");
        System.out.println("1. 0-1 /n 2. 2-4 /n 3. 5-9 /n 4.10+");
        System.out.println("Enter the date in the format mm/dd/yy");


    }

    public static void main(String[] args) {
        setup();
        driver.findElement(By.xpath("(//a[@href='/form'])[3]")).click();
        details();
        String firstname=sc.nextLine();
        String lastname=sc.nextLine();
        String jobtitle=sc.nextLine();
        driver.findElement(By.xpath("(//input)[1]")).sendKeys(firstname);
        driver.findElement(By.xpath("(//input)[2]")).sendKeys(lastname);
        driver.findElement(By.xpath("(//input)[3]")).sendKeys(jobtitle);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                driver.findElement(By.xpath("(//input)[4]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("(//input)[5]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("(//input)[6]")).click();
                break;
        }

        int k=sc.nextInt();
        switch(k)
        {
            case 1:
                driver.findElement(By.xpath("(//input)[7]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("(//input)[8]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("(//input)[9]")).click();
                break;
        }
        int p=sc.nextInt();
        Select s1= new Select(driver.findElement(By.id("select-menu")));
        if(p==1)
        {
            s1.selectByValue("1");
        }
        if(p==2)
        {
            s1.selectByValue("2");
        }
        if(p==3)
        {
            s1.selectByValue("3");
        }
        if(p==4)
        {
            s1.selectByValue("4");
        }

        String a=sc.nextLine();
        WebElement date=driver.findElement(By.xpath("(//input)[10]"));
        date.sendKeys("09/30/2019");
        driver.findElement(By.xpath("(//a)[18]")).click();



    }

}
