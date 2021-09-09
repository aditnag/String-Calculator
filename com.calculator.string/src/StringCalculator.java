
public class StringCalculator
{
    public static int Add(String input) {
        String[] numbers = input.split(",");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1){
            return stringToInt(input);
        }
        else {
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
    }
    private static boolean isEmpty(String input){
        return input.isEmpty();
    }
    private static int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
