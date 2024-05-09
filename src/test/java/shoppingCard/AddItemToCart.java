package shoppingCard;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ItemInformationPage;
import pages.NoteBookPage;

import static org.testng.AssertJUnit.assertTrue;

public class AddItemToCart extends BaseTests {

    @Test
    public void testBarNotificationSuccess() {
        NoteBookPage noteBookPage = homePage.moveToNoteBookPage();
        ItemInformationPage itemInformationPage = noteBookPage.clickOnAddToCartButton();
        itemInformationPage.clickOnAddToCartButton();
        assertTrue(itemInformationPage.barNotificationIsDisplayed());
        itemInformationPage.hoverOverShoppingCart();
        String actualResult = itemInformationPage.getText();
        String exceptedResult = "2";
       // Assert.assertEquals(actualResult,exceptedResult);
        Assert.assertTrue(actualResult.contains(exceptedResult));
    }
}
