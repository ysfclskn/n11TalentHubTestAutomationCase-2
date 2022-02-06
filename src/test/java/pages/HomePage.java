package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class HomePage {

  public static void searchFor(String search_term){
     WebElement searchField =  Driver.get().findElement(By.id("searchData"));
     WebElement searchBtn = Driver.get().findElement(By.xpath("//a[@title='ARA']"));
        searchField.click();
        searchField.sendKeys(search_term);
        searchBtn.click();

  }
}
