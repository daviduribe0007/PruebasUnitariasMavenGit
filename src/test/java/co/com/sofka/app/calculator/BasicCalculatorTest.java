package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several Subtraction")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "8,    10,  -2",
            "89,   9,   80",
            "1,    100, -99"
    })
    public void severalSubtraction(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtraction(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Multiplication")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,   1,   0",
            "10,  8,   80",
            "39,  1,   39",
            "8,   15,  120"
    })
    public void severalSMultiplication(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplication(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several division")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "10,   5,   2",
            "3,    2,   1.5",
            "0,    1,   0",
            "1000, 100, 10"
    })
    public void severaldivision(double first, double second, double expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}