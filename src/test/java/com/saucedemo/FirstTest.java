package com.saucedemo;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void FirstTest(){
        open("https://www.saucedemo.com/");
        $(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        $(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        $(By.xpath("//input[@id='login-button']")).click();
        $(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        $(By.xpath("//a[@class='shopping_cart_link']")).click();
        $(By.xpath("//button[@id='checkout']")).click();
        $(By.xpath("//input[@id='first-name']")).sendKeys("Vladimir");
        $(By.xpath("//input[@id='last-name']")).sendKeys("Shendypin");
        $(By.xpath("//input[@id='postal-code']")).sendKeys("1123456");
        $(By.xpath("//input[@id='continue']")).click();
        $(By.xpath("//button[@id='finish']")).click();







    }
}
