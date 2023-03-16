package th2;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz){
            return "Fizzbuzz";
        }
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return number+ " ";
    }
}
