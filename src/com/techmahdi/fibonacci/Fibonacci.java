package com.techmahdi.fibonacci;

public class Fibonacci {

    int numberOne, numberTwo, nextNumber, length;

    int[] fibonacci;

    Fibonacci(int firstNumber, int secondNumber, int length) {
        numberOne = firstNumber;
        numberTwo = secondNumber;
        this.length = length;

        fibonacci = new int[length+5];

    }

    void generateFibonacci() {
        if (length == 1) {
            fibonacci[0] = numberOne;
        } else if (length == 0) {
            fibonacci[1] = numberTwo;
        } else {
            fibonacci[0]= numberOne;
            fibonacci[1] = numberTwo;
            for (int i = 2; i < length; i++) {
                nextNumber = numberOne + numberTwo;
                fibonacci[i] = nextNumber;

                numberOne = numberTwo;
                numberTwo = nextNumber;
            }
        }
    }


    void printFibonacci() {
        if (length == 1) {
            System.out.println("1st Fibonacci number is: " + fibonacci[0]);
        } else if (length == 2) {
            System.out.println("1st Fibonacci number is: " + fibonacci[0]);
            System.out.println("2nd Fibonacci number is: " + fibonacci[1]);
        } else {
            for (int i = 0; i < length; i++) {

                System.out.println((i + 1) + "th Fibonacci number is: " + fibonacci[i]);

            }
        }


    }
}

