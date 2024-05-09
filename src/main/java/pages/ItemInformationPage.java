package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ItemInformationPage extends MethodHandles {
    public ItemInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartButton = By.cssSelector("#add-to-cart-button-4");
    private final By shoppingCart = By.cssSelector("#topcartlink");

    private final By quantityText = By.cssSelector("div.count > a[href='/cart']");

    public void clickOnAddToCartButton(){
        click(addToCartButton,6);
    }

    public void hoverOverShoppingCart(){
        hoverOverElement(shoppingCart,6);
    }

    public String getQuantityText(){
       return getText(quantityText,6);
    }

    public String getText(){
        return driver.findElement(shoppingCart).getText();
    }



}
