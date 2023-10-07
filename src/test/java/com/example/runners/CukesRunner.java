package com.bookstore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/bookstore/step_defs",
        plugin = {
                "html:target/default-html-reports.html"
        },
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}
