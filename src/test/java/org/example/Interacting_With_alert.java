package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Interacting_With_alert extends Driver_Setup {

    @Test
    public void TestAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);


        // JS Alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("JS Alert Text: "+alert.getText());
        alert.accept();
        Thread.sleep(2000);

        // JS Confirm
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        System.out.println("JS Alert Confirm Text: "+alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);


        // JS Prompt
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        System.out.println("JS Prompt Text: " +alert.getText());
        alert.sendKeys("Abdul Alim");
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);



    }
}
