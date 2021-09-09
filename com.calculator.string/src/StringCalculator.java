
public class StringCalculator
{
    public static int Add(String input) {
        if (!isEmpty(input)) {
            return stringToInt(input);
        } else {
            return 0;
        }
    }
    private static boolean isEmpty(String input){
        return input.isEmpty();
    }
    private static int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
