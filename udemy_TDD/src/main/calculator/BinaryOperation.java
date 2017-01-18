package calculator;

import java.math.BigDecimal;

/**
 * Created by ashokbance on 14/01/2017.
 */
public abstract class BinaryOperation implements Operation {


    public void apply(OperandStack values) {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(calculate(value1, value2));
    }

    public abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);

}
