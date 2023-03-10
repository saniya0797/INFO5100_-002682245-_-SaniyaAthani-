package com.example.exercise9;

public class Calculate {
    double operand1,operand2; //declaring variable to store operands values
    String operator ="";  //initializing operator as a empty string
    double calculator(double operand1, double operand2, String operator){     //method to perform basic arithmetic operations based on '+',-','/','*','%' operators and return double value as a result
        switch (operator) {
            case "+":return operand1 + operand2;

            case "-":return operand1 - operand2;

            case "*":return operand1 * operand2;

            case "%":return operand1 % operand2;
            case "/":
                if(operand2==0)
                    return 0;
                return operand1 / operand2;
            default:return 0;                //default return value
        }
    }
}
