package calculator;

import java.math.BigDecimal;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class Calculator {

    OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {
        return values.peek();
    }

    /**
     * Changing the value at the top of the stack
     * @param value
     */
    public void setAccumulator(BigDecimal value) {
        values.replaceTop(value);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }

    public void execute(String op) {
        Operation operation = null;
        if ("+".equals(op))
            operation = new AddOperation();
        else if ("-".equals(op))
            operation = new SubtractOperation();

        operation.apply(values);
    }
}
