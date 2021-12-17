package com.testautomation.setup;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileAndroidDriver {

    @Given("The user setup the app")
    public void the_user_setup_the_app() {
       androidSetup();
    }
    public void androidSetup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
            capabilities.setCapability("appPackage", "io.selendroid.testapp");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("app", "C:\\Users\\shash\\Documents\\mobile-automation-test\\bundle-to-test\\selendroid-test-app-0.17.0.apk");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver driver = new AndroidDriver(url, capabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
