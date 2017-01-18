package calculator;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class NewCalculatorTest {
    Calculator calculator;


    @Before
    public void createNewCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulatorValue() {
        BigDecimal value = new BigDecimal(22);
        calculator.setAccumulator(value);

        assertEquals(value, calculator.getAccumulator());
    }




}
