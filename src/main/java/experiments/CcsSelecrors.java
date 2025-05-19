package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CcsSelecrors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorHomePage(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        hideBanner();
        hideFoter();



        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));

        WebElement divElements = driver.findElement(By.cssSelector(".card-up"));
        divElements.click();
        pause(3);

        WebElement radioButon = driver.findElement(By.id("item-2"));
        radioButon.click();
        pause(3);

        WebElement radioButonYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        radioButonYes.click();

        pause(3);
        driver.navigate().back();
        pause(3);
        driver.navigate().back();
        hideBanner();
        hideFoter();

        WebElement divBookStore=driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:last-child"));
        divBookStore.click();
        pause(3);
        driver.navigate().back();

        WebElement divWidgets = driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:nth-child(4)"));




        pause(5);
        // driver.quit();




    }
public  void  pause (int time){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
public void hideBanner(){
    JavascriptExecutor js =(JavascriptExecutor) driver;
    js.executeScript("document.querySelector('#fixedban')" +
            ".style.display='none'");



}
public void hideFoter(){
    JavascriptExecutor js =(JavascriptExecutor) driver;
    js.executeScript("document.querySelector('#fixedban')" +
            ".style.display='none'");

}
}
