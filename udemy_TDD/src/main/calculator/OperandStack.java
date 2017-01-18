package calculator;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class OperandStack {
    Stack<BigDecimal> stack = new Stack<>();

    public BigDecimal peek() {
        if (stack.size() == 0)
            return BigDecimal.ZERO;
        return stack.peek();
    }

    public void push(BigDecimal value) {
        stack.push(value);
    }

    public void replaceTop(BigDecimal value2) {
        pop();
        stack.push(value2);
    }

    public void pop() {
        if (stack.size() > 0)
            stack.pop();
    }
}
