package com.epam.unit4.main;

import java.util.Scanner;

public class TrainingTask01 {
	public static void main(String[] args) {
	    int sum = 0;
	    int mul = 0;
	    int x;
	    int y;

	    x = readFromConsole("¬ведите X: ");
	    y = readFromConsole("¬ведите Y: ");

	    sum = calcSUM(x, y);
	    mul = calcMUL(x, y);
	    
	    printResult(sum, mul);

	  }

	  public static int calcSUM(int x, int y) {
	    int sum;
	    
	    sum = x + y;

	    return sum;
	  }

	  public static int calcMUL(int x, int y) {
	    int mul;
	    
	    mul = x * y;

	    return mul;
	  }

	  public static int readFromConsole(String message) {
	    Scanner conin = new Scanner(System.in);
	    System.out.println(message);
	    while (!conin.hasNextInt()) {
	      conin.next();
	    }
	    int x = conin.nextInt();
	    return x;
	  }

	  public static void printResult(int sum, int mul) {
	    System.out.println("sum = " + sum + "; mul = " + mul);
	  }

}