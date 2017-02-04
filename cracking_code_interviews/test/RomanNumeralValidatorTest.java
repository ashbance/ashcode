import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ashokbance on 04/02/2017.
 */
public class RomanNumeralValidatorTest {

    String invalidR3 = "VVVIIIIXXXX";
    String validR3 = "VVVIIIXXX";
    String _3invalidSymbols = "VVVXAXBXPIII";

    RomanNumeralsValidator validator;

    @Before
    public void createRomanNumeralStringsToTest() {
        validator = new RomanNumeralsValidator();

    }

    @Test
    public void testAllSymbolsAreValid() {

        char[] chars = _3invalidSymbols.toCharArray();
        int count = 0;

        for (char c: chars) {
            if (validator.getSymbolValue(c) == -1) {count++;}
        }

        Assert.assertEquals("3 invalid symbols", 3, count);

    }


    @Test
    public void testRuleOf3HasNotbeenViolated() {
        boolean bad = validator.checkRuleOfThree(invalidR3);
        boolean good = validator.checkRuleOfThree(validR3);

        Assert.assertEquals("should faile 3 validation", false, bad);
        Assert.assertEquals("passes 3 validation", true, good);
    }

    @Test
    public void testRuleOfAddition() {


    }


}
