package calculator;

import java.math.BigDecimal;

/**
 * Created by ashokbance on 14/01/2017.
 */
public class AddOperation extends BinaryOperation {

    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }
}
