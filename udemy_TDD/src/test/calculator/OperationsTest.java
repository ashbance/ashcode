package calculator;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class OperationsTest {

    Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(33));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(22));
    }



    @Test
    public void testAddExecution() {
        calculator.execute("+");
        assertEquals(new BigDecimal(55), calculator.getAccumulator());
    }
    @Test
    public void testSubtractExecution() {
        calculator.execute("-");
        assertEquals(new BigDecimal(11), calculator.getAccumulator());
    }



}
