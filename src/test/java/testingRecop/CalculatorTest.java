package testingRecop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    void add() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;

        //when
        int actualAddResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(15, actualAddResult); //JUNIT assertEquals
        assertThat(actualAddResult).isEqualTo(15); //Tas pats su ASSERTJ biblioteka
    }

    @Test
    void testAddMultipleNumbers() {
        int[] numberToTest = {5, 2, -6, 8, 1};

        int actualRezult = calculator.addMultipleNumbers(numberToTest);

        assertEquals(10, actualRezult);
        assertThat(actualRezult).isEqualTo(10);
    }
    @Test
    void minusNumbers(){
        int firstNumber = 5;
        int secondNumber = 2;

        int actualResult = calculator.minusNubers(firstNumber, secondNumber);

        assertEquals(3,actualResult);
    }

    @Test
    void minusMultipleNumbers(){
        int [] numbersToTest = {5, 3, 11, 8};

        int actualNumber = calculator.addMinusMultipleNumbers(numbersToTest);

        assertEquals(-17, actualNumber);
    }

    @Test
    void multiplyNumbers(){
        int firstNumber = 2;
        int secondNumber = 2;

        int actualNumber = calculator.multiply(firstNumber, secondNumber);

        assertEquals(4,actualNumber);
    }
    @Test
    void testDivide(){
        double firstNumbers = 4;
        double secondNumber = 2;

        double actualNumber = calculator.divide(firstNumbers, secondNumber);

        assertEquals(2, actualNumber);
    }

    @Test
    void testDivideTwoNumbersResultIsNotInteger(){
        double firstNumber = 7;
        double secondNumber = 2;

        double actualNumber = calculator.divide(firstNumber, secondNumber);

        assertEquals(3.5, actualNumber);
    }

    @Test
    void testDivideNumberByZero() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divideIntegers(5, 0)
        );

        assertTrue(exception.getMessage().contains("by zero"));

    }
}