package com.testautomation.steps;

import com.testautomation.setup.MobileAndroidDriver;
import io.cucumber.java.en.Given;

public class Selendroid_Test extends MobileAndroidDriver {

    @Given("^The user setup the app$")
    public void the_user_setup_the_app() {
        androidSetup();
    }
}
