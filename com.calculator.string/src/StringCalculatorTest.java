import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class StringCalculatorTest {
    @Test
    public void emptyStringToZero() {
        Assertions.assertEquals(StringCalculator.Add(""), 0);
    }

    @Test
    public void sumSingleDigitToItself() {
        Assertions.assertEquals(StringCalculator.Add("1"), 1);
    }

    @Test
    public void sumTwoNumbersCommaDelimited() {
        Assertions.assertEquals(StringCalculator.Add("1,2"), 3);
        Assertions.assertEquals(StringCalculator.Add("1,5"), 6);

    }

    @Test
    public void multipleNumbersReturnSum() {
        Assertions.assertEquals(StringCalculator.Add("1,3,5"), 9);
        Assertions.assertEquals(StringCalculator.Add("1\n5,5,5"), 16);
    }

    @Test
    public void twoNumNewLineDelimitedReturnSum() {
        Assertions.assertEquals(StringCalculator.Add("1\n2"), 3);
        Assertions.assertEquals(StringCalculator.Add("1\n9"), 10);
    }

    @Test
    public void supportDifferentDelimiters() {
        Assertions.assertEquals(StringCalculator.Add("“//;\\n1;2"), 3);
    }
}
