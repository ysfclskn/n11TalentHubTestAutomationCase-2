package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SearchResultPage;

public class Case3Steps {
    @Given("I searches for {string}")
    public void iSearchesFor(String search_term) {
        HomePage.searchFor(search_term);
    }

    @Then("I should see list and I filter second brand")
    public void iShouldSeeListAndIFilterSecondBrand() {
        SearchResultPage.filterBySecondBrands();

    }

    @And("I sort list by comments")
    public void iSortListByComments() {
        SearchResultPage.sortByCommentsCount();
    }

    @And("I sort products by free shpinig")
    public void iSortProductsByFreeShpinig() {
        SearchResultPage.filterByFreeShipping();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
