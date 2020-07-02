package com.techmahdi.fibonacci;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fibonacci fibonacci = new Fibonacci(0, 1, 10);
        fibonacci.generateFibonacci();
        fibonacci.printFibonacci();
    }
}
