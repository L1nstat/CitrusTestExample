package ru.L1nstat.example.tests;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.testit.annotations.DisplayName;
import ru.testit.annotations.ExternalId;

public class ExampleTest extends TestNGCitrusTestRunner {

    @DisplayName("example")
    @ExternalId("example")
    @Test
    @Parameters(value = {"testContext"})
    @CitrusTest
    public void example(@Optional @CitrusResource TestContext testContext) {
        testContext.setVariable("expectedValue", "string");
        Assert.assertEquals("string", testContext.getVariable("expectedValue"));
    }

}
