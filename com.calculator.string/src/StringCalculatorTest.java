import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class StringCalculatorTest
{
    @Test
    public void emptyStringToZero()
    {
        Assertions.assertEquals(StringCalculator.Add(""),0);
    }
}