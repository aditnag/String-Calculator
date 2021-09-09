
public class StringCalculator
{
    private static final String delimiter = ",|\n";

    public static int Add(String input) {
        String[] numbers = input.split(delimiter);
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1){
            return stringToInt(input);
        }
        else {
            return getSum(numbers);
        }
    }
    private static int getSum(String[] num){
        int sum = 0;
        for(int current = 0; current < num.length; current++ )
        {
            sum+=Integer.parseInt(num[current]);
        }
        return sum;
    }

    private static boolean isEmpty(String input){
        return input.isEmpty();
    }
    private static int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
