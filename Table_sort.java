package BaseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;


public class Table_sort {
    public static WebDriver driver;



    public static  void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-table/");
    }
    public static void main(String args[])
    {
        setup();
        List<WebElement> structure= driver.findElements(By.xpath("//tbody//th[@ scope=\"row\"]"));
        List<WebElement> date=driver.findElements(By.xpath("//tbody//th[@ scope=\"row\"]/following-sibling::td[4]"));
        List<Integer> list=new LinkedList<>();
        List<String> list2=new LinkedList<>();

        for(WebElement we:date)
        {
            int Date =Integer.parseInt(we.getText());
            list.add(Date);
        }

        Map<String,String> tm = new LinkedHashMap<>();
        for(int i=0;i<structure.size();i++)
        {
            tm.put(structure.get(i).getText(),date.get(i).getText());
        }
        for(Map.Entry<String,String> mp:tm.entrySet()) {
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        Iterator<Integer> it= list.iterator();
        System.out.println("Dates before sort");

            while(it.hasNext()){
                Integer i= it.next();
                System.out.println(i);
            }

            for(int i=0;i<list.size();i++)
            {
                for(int j=i+1;j<list.size();j++)
                {
                    if(list.get(i)>list.get(j))
                    {
                        int temp1=list.get(i);
                        int temp2=list.get(j);
                        list.set(j,temp1);
                        list.set(i,temp2);
                    }
                }
            }
            System.out.println("Dates after sort"+list);

        for(int k=0; k<structure.size();k++)
        {
            String Structure=structure.get(k).getText();
            list2.add(Structure);
        }
        Collections.sort(list2);
        System.out.println("Structure name after sort:");
        Iterator<String> co= list2.iterator();

        while(co.hasNext()){
            String i= co.next();
            System.out.println(i);
        }

        System.out.println("Sorted data:");

        Map<String,String> hm = new TreeMap<>();
        for(int j=0;j<structure.size();j++)
        {
            hm.put(date.get(j).getText(),structure.get(j).getText());
        }
        for(Map.Entry<String,String> m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }






    }
}
