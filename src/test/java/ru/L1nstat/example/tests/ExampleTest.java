package ru.L1nstat.example.tests;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.testit.annotations.DisplayName;
import ru.testit.annotations.ExternalId;

public class ExampleTest extends TestNGCitrusTestRunner {

    @DisplayName("example")
    @ExternalId("example")
    @Test
    @Parameters(value = {"context"})
    @CitrusTest
    public void example() {
        Assert.assertEquals(true, true);
    }

}
