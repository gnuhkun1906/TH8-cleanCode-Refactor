package th1.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import th1.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculatorTest(){
        int firstOperand =1;
        int secondOperand =1;
        char operator ='+';
        int expected=2;

        int result= Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Subtraction")
    void testCalculatorSub(){
        int firstOperand =3;
        int secondOperand =1;
        char operator ='-';
        int expected=2;

        int result= Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Multiplication")
    void testCalculatorMul(){
        int firstOperand =2;
        int secondOperand =1;
        char operator ='*';
        int expected=2;

        int result= Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Division")
    void testCalculatorDiv(){
        int firstOperand =2;
        int secondOperand =1;
        char operator ='/';
        int expected=2;

        int result= Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Division by zero")
    void testDivisionByZeoro(){
        int firstOperand =2;
        int secondOperand =0;
        char operator ='/';
        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, operator);});
    }
    void testCalculatorWrongOperator(){
        int firstOperand =2;
        int secondOperand =0;
        char operator ='=';
        assertThrows(RuntimeException.class,()-> {Calculator.calculate(firstOperand, secondOperand, operator);});
    }

}
