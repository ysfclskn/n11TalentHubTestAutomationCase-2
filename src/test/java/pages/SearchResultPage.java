package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {

    public static void filterBySecondBrands(){
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement secondBrand = Driver.get().findElement(By.xpath("(//div[@class=\"filterList\"])[3]/div[2]/label/input"));
        secondBrand.click();


    }

    public static void sortByCommentsCount(){
        WebElement sortList = Driver.get().findElement(By.xpath("(//div[@class=\"listOption queueOption\"])[1]"));
        WebElement sortComment = Driver.get().findElement(By.xpath("//*[@id=\"sortingType\"]/option[5]"));
        sortList.click();
        sortComment.click();
    }

    public static void filterByFreeShipping(){
        WebElement freeShippingCheckBox = Driver.get().findElement(By.id("freeShippingOption"));
        freeShippingCheckBox.click();
    }
}
