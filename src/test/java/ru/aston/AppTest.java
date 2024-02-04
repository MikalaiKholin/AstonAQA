package ru.aston;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppTest {

    @DataProvider(name = "factorials")
    public Object[][] factorials() {
        return new Object[][] {
                { 1, 1 },
                { 2, 2 },
                { 5, 120 },
                { 10, 3628800 }
        };
    }
    @Test(dataProvider = "factorials")
    public void testFactorial(int number, int factorial) {
        assertEquals(factorial, App.factorial(number));
    }
}
