package ru.aston;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "5, 120",
            "10, 3628800"
    })
    void testFactorial(int number, int factorial) {
        Assertions.assertEquals(factorial, App.factorial(number));
    }
}
