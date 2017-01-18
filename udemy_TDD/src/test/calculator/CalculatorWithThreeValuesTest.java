package calculator;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class CalculatorWithThreeValuesTest {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    @Before
    public void calculatorWithThreeFields() {
        calculator = new Calculator();

        value1 = new BigDecimal(12);
        value2 = new BigDecimal(42);
        value3 = new BigDecimal(122);

        calculator.setAccumulator(value1);
        calculator.enter();

        calculator.setAccumulator(value2);
        calculator.enter();

        calculator.setAccumulator(value3);
    }

    @Test
    public void testAccumulatorAfterPushingThreeValues() {
        assertEquals(value3, calculator.getAccumulator());

    }

    @Test
    public void testAccumulatorAfterSingleDrop() {

        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());
    }


    @Test
    public void testAccumulatorAfterDroppingTwice() {
        calculator.drop();
        calculator.drop();

        assertEquals(value1, calculator.getAccumulator());
    }

}
