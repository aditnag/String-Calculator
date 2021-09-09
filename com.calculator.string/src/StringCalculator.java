
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
            return getSum(numbers[0],numbers[1]);
        }
    }
    private static int getSum(String num1, String num2){
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    private static boolean isEmpty(String input){
        return input.isEmpty();
    }
    private static int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
