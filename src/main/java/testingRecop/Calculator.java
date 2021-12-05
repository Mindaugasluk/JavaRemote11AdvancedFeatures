package testingRecop;

import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber){
        LOGGER.info("Adding two numbers" + firstNumber + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers){
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        return totalSum;
    }
}
