package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v127.network.model.Request;

import static helper.WebUtility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebModel {

    private static Request allPhones;

    public static Request allPhonesList(){
        String expectedPhone1 = "Samsung galaxy s6";
        String actualPhone1 = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']")).getText();
        assertEquals(expectedPhone1, actualPhone1);
        String expectedPhone2 = "Nokia lumia 1520";
        String actualPhone2 = driver.findElement(By.xpath("//a[normalize-space()='Nokia lumia 1520']")).getText();
        assertEquals(expectedPhone2, actualPhone2);
        String expectedPhone3 = "Nexus 6";
        String actualPhone3 = driver.findElement(By.xpath("//a[normalize-space()='Nexus 6']")).getText();
        assertEquals(expectedPhone3, actualPhone3);
        String expectedPhone4 = "Samsung galaxy s7";
        String actualPhone4 = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s7']")).getText();
        assertEquals(expectedPhone4, actualPhone4);
        String expectedPhone5 = "Iphone 6 32gb";
        String actualPhone5 = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']")).getText();
        assertEquals(expectedPhone5, actualPhone5);
        String expectedPhone6 = "Sony xperia z5";
        String actualPhone6 = driver.findElement(By.xpath("//a[normalize-space()='Sony xperia z5']")).getText();
        assertEquals(expectedPhone6, actualPhone6);
        String expectedPhone7 = "HTC One M9";
        String actualPhone7 = driver.findElement(By.xpath("//a[normalize-space()='HTC One M9']")).getText();
        assertEquals(expectedPhone7, actualPhone7);
        return allPhones;
    }

    private static Request allLaptops;

    public static Request allLaptopsList(){
        String expectedLaptop1 = "Sony vaio i5";
        String actualLaptop1 = driver.findElement(By.xpath("//a[normalize-space()='Sony vaio i5']")).getText();
        assertEquals(expectedLaptop1, actualLaptop1);
        String expectedLaptop2 = "Sony vaio i7";
        String actualLaptop2 = driver.findElement(By.xpath("//a[normalize-space()='Sony vaio i7']")).getText();
        assertEquals(expectedLaptop2, actualLaptop2);
        String expectedLaptop3 = "MacBook air";
        String actualLaptop3 = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']")).getText();
        assertEquals(expectedLaptop3, actualLaptop3);
        String expectedLaptop4 = "Dell i7 8gb";
        String actualLaptop4 = driver.findElement(By.xpath("//a[normalize-space()='Dell i7 8gb']")).getText();
        assertEquals(expectedLaptop4, actualLaptop4);
        String expectedLaptop5 = "2017 Dell 15.6 Inch";
        String actualLaptop5 = driver.findElement(By.xpath("//a[normalize-space()='2017 Dell 15.6 Inch']")).getText();
        assertEquals(expectedLaptop5, actualLaptop5);
        String expectedLaptop6 = "MacBook Pro";
        String actualLaptop6 = driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']")).getText();
        assertEquals(expectedLaptop6, actualLaptop6);
        return allLaptops;
    }

    private static Request allMonitors;

    public static Request allMonitorsList(){
        String expectedMonitor1 = "Apple monitor 24";
        String actualMonitor1 = driver.findElement(By.xpath("//a[normalize-space()='Apple monitor 24']")).getText();
        assertEquals(expectedMonitor1, actualMonitor1);
        String expectedMonitor2 = "ASUS Full HD";
        String actualMonitor2 = driver.findElement(By.xpath("//a[normalize-space()='ASUS Full HD']")).getText();
        assertEquals(expectedMonitor2, actualMonitor2);
        return allMonitors;
    }

    private static Request previousProducts;

    public static Request previousProducts(){
        String expectedProduct1 = "Nokia lumia 1520";
        String actualProduct1 = driver.findElement(By.xpath("//a[normalize-space()='Nokia lumia 1520']")).getText();
        assertEquals(expectedProduct1, actualProduct1);
        String expectedProduct2 = "Nexus 6";
        String actualProduct2 = driver.findElement(By.xpath("//a[normalize-space()='Nexus 6']")).getText();
        assertEquals(expectedProduct2, actualProduct2);
        String expectedProduct3 = "Samsung galaxy s7";
        String actualProduct3 = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s7']")).getText();
        assertEquals(expectedProduct3, actualProduct3);
        String expectedProduct4 = "Iphone 6 32gb";
        String actualProduct4 = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']")).getText();
        assertEquals(expectedProduct4, actualProduct4);
        String expectedProduct5 = "Sony xperia z5";
        String actualProduct5 = driver.findElement(By.xpath("//a[normalize-space()='Sony xperia z5']")).getText();
        assertEquals(expectedProduct5, actualProduct5);
        String expectedProduct6 = "HTC One M9";
        String actualProduct6 = driver.findElement(By.xpath("//a[normalize-space()='HTC One M9']")).getText();
        assertEquals(expectedProduct6, actualProduct6);
        String expectedProduct7 = "Sony vaio i5";
        String actualProduct7 = driver.findElement(By.xpath("//a[normalize-space()='Sony vaio i5']")).getText();
        assertEquals(expectedProduct7, actualProduct7);
        String expectedProduct8 = "Sony vaio i7";
        String actualProduct8 = driver.findElement(By.xpath("//a[normalize-space()='Sony vaio i7']")).getText();
        assertEquals(expectedProduct8, actualProduct8);
        String expectedProduct9 = "Apple monitor 24";
        String actualProduct9 = driver.findElement(By.xpath("//a[normalize-space()='Apple monitor 24']")).getText();
        assertEquals(expectedProduct9, actualProduct9);
        return previousProducts;
    }

    private static Request nextProducts;

    public static Request nextProducts(){
        String expectedProduct1 = "Apple monitor 24";
        String actualProduct1 = driver.findElement(By.xpath("//a[normalize-space()='Apple monitor 24']")).getText();
        assertEquals(expectedProduct1, actualProduct1);
        String expectedProduct2 = "MacBook air";
        String actualProduct2 = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']")).getText();
        assertEquals(expectedProduct2, actualProduct2);
        String expectedProduct3 = "Dell i7 8gb";
        String actualProduct3 = driver.findElement(By.xpath("//a[normalize-space()='Dell i7 8gb']")).getText();
        assertEquals(expectedProduct3, actualProduct3);
        String expectedProduct4 = "2017 Dell 15.6 Inch";
        String actualProduct4 = driver.findElement(By.xpath("//a[normalize-space()='2017 Dell 15.6 Inch']")).getText();
        assertEquals(expectedProduct4, actualProduct4);
        String expectedProduct5 = "ASUS Full HD";
        String actualProduct5 = driver.findElement(By.xpath("//a[normalize-space()='ASUS Full HD']")).getText();
        assertEquals(expectedProduct5, actualProduct5);
        String expectedProduct6 = "MacBook Pro";
        String actualProduct6 = driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']")).getText();
        assertEquals(expectedProduct6, actualProduct6);
        return nextProducts;
    }

    private static Request nokiaLumiaDetailsPage;

    public static Request nokiaLumiaDetailsPage(){
        String expectedTitle = "Nokia lumia 1520";
        String actualTitle = driver.findElement(By.xpath("//h2[normalize-space()='Nokia lumia 1520']")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedPrice = "$820 *includes tax";
        String actualPrice = driver.findElement(By.xpath("//h3[text()='$820']")).getText();
        assertEquals(expectedPrice, actualPrice);
        String expectedDescription = "The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.";
        String actualDescription = driver.findElement(By.xpath("//p[contains(text(),'The Nokia Lumia 1520 is powered by 2.2GHz quad-cor')]")).getText();
        assertEquals(expectedDescription, actualDescription);
        return nokiaLumiaDetailsPage;
    }

    private static Request galaxySixDetailsPage;

    public static Request galaxySixDetailsPage(){
        String expectedTitle = "Samsung galaxy s6";
        String actualTitle = driver.findElement(By.xpath("//h2[contains(.,'Samsung galaxy s6')]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedPrice = "$360 *includes tax";
        String actualPrice = driver.findElement(By.xpath("//h3[text()='$360']")).getText();
        assertEquals(expectedPrice, actualPrice);
        String expectedDescription = "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.";
        String actualDescription = driver.findElement(By.xpath("//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-co')]")).getText();
        assertEquals(expectedDescription, actualDescription);
        return galaxySixDetailsPage;
    }

    private static Request nexusSixDetailsPage;

    public static Request nexusSixDetailsPage(){
        String expectedTitle = "Nexus 6";
        String actualTitle = driver.findElement(By.xpath("//h2[normalize-space()='Nexus 6']")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedPrice = "$650 *includes tax";
        String actualPrice = driver.findElement(By.xpath("//h3[text()='$650']")).getText();
        assertEquals(expectedPrice, actualPrice);
        String expectedDescription = "The Motorola Google Nexus 6 is powered by 2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM.";
        String actualDescription = driver.findElement(By.xpath("//p[contains(text(),'The Motorola Google Nexus 6 is powered by 2.7GHz q')]")).getText();
        assertEquals(expectedDescription, actualDescription);
        return nexusSixDetailsPage;
    }

    private static Request galaxySevenDetailsPage;

    public static Request galaxySevenDetailsPage(){
        String expectedTitle = "Samsung galaxy s7";
        String actualTitle = driver.findElement(By.xpath("//h2[normalize-space()='Samsung galaxy s7']")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedPrice = "$800 *includes tax";
        String actualPrice = driver.findElement(By.xpath("//h3[text()='$800']")).getText();
        assertEquals(expectedPrice, actualPrice);
        String expectedDescription = "The Samsung Galaxy S7 is powered by 1.6GHz octa-core it comes with 4GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 200GB via a microSD card.";
        String actualDescription = driver.findElement(By.xpath("//p[contains(text(),'The Samsung Galaxy S7 is powered by 1.6GHz octa-core')]")).getText();
        assertEquals(expectedDescription, actualDescription);
        return galaxySevenDetailsPage;
    }

    private static Request iphoneSixDetailsPage;

    public static Request iphoneSixDetailsPage(){
        String expectedTitle = "Iphone 6 32gb";
        String actualTitle = driver.findElement(By.xpath("//h2[normalize-space()='Iphone 6 32gb']")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedPrice = "$790 *includes tax";
        String actualPrice = driver.findElement(By.xpath("//h3[text()='$790']")).getText();
        assertEquals(expectedPrice, actualPrice);
        String expectedDescription = "It comes with 1GB of RAM. The phone packs 16GB of internal storage cannot be expanded. As far as the cameras are concerned, the Apple iPhone 6 packs a 8-megapixel primary camera on the rear and a 1.2-megapixel front shooter for selfies.";
        String actualDescription = driver.findElement(By.xpath("//p[contains(text(),'It comes with 1GB of RAM.')]")).getText();
        assertEquals(expectedDescription, actualDescription);
        return iphoneSixDetailsPage;
    }

}
