package th2.test;

import org.junit.jupiter.api.Test;
import th2.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void Fiiz3() {
        int number = 3;

        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void Buzz5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void FizzBuzz15() {
        int number = 15;
        String expected = "Fizzbuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}
