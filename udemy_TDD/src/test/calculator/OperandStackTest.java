package calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();
    }

    @Test
    public void testNewOperandStackPeekReturnsZero() {
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void testPushingValueOntoTheStack() {

        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingValueAtTopOfStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        BigDecimal value2 = new BigDecimal(33);

        stack.replaceTop(value2);
        assertEquals(value2, stack.peek());
    }

    @Test
    public void testReplacingTopWithEmptyStack() {
        BigDecimal value = new BigDecimal(12);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingValueFromStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        stack.push(new BigDecimal(55));
        stack.pop();
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingEmptyStack() {
        stack.pop();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
}
