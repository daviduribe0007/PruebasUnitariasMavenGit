package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2) {
        logger.info("Summing {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2) {
        logger.info("Summing {} * {}", number1, number2);
        return number1 * number2;
    }

    public double division(double number1, double number2) {
        logger.info("Summing {} / {}", number1, number2);
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            logger.info("No se puede divir por 0");
            return 0;
        }

    }


}
