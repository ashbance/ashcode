package calculator;

import java.math.BigDecimal;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class SubtractOperation extends BinaryOperation {

    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.subtract(value1);
    }
}
