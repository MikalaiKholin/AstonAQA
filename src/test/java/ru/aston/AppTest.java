package ru.aston;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppTest {

    @DataProvider(name = "factorials")
    public int[][] parameterProvider() {
        return new int[][]{new int[]{1, 1}};
    }
    @Test
    void testFactorial() {
        assertEquals(120, App.factorial(5));
    }
}
