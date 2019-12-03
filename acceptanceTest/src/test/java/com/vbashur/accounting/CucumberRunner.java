package com.vbashur.accounting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/com/vbashur/accounting")
public class CucumberRunner {
}
