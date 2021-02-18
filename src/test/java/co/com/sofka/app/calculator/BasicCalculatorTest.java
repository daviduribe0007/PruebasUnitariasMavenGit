package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        basicCalculator.sum(number1, number2);
    }




    @Test
    void subtraction() {
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }
}