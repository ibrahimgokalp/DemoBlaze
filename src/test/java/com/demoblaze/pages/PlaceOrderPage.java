package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends BasePage{

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement creditCard;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchase;

    public void fillForm(){
        name.sendKeys("Abraham");
        country.sendKeys("Turkey");
        city.sendKeys("Ankara");
        creditCard.sendKeys("123456789");
        month.sendKeys("10");
        year.sendKeys("2022");
        purchase.click();

    }
    @FindBy(xpath="//p[@class='lead text-muted ']/text()[1]")
    public WebElement orderId;

    @FindBy(xpath="//p[@class='lead text-muted ']/text()[2]")
    public WebElement actualPurchaseAmount;

}
