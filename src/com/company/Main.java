package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean exit = false;

        while (!exit) {
            System.out.println("Calculator");
            System.out.print("Enter 1st number: ");
            double x = scanner.nextDouble();
            System.out.print("Enter operator (+, -, x, /)");
            String operator = scanner.next();
            System.out.print("Enter 2nd number: ");
            double y = scanner.nextDouble();

            if (operator.equals("+")) {
                result = x + y;
                System.out.println(result);
                System.out.print("Exit? y/n: ");
                String breakOut = scanner.next();
                if (breakOut .equals("y") || breakOut.equals("Y")){
                    exit = true;
                }
            } else if (operator.equals("-")) {
                result = x - y;
                System.out.println(result);
                System.out.print("Exit? y/n: ");
                String breakOut = scanner.next();
                if (breakOut .equals("y") || breakOut.equals("Y")){
                    exit = true;
                }
            } else if (operator.equals("x") || operator.equals("*")) {
                result = x * y;
                System.out.println(result);
                System.out.print("Exit? y/n: ");
                String breakOut = scanner.next();
                if (breakOut .equals("y") || breakOut.equals("Y")){
                    exit = true;
                }
            } else if (operator.equals("/")) {
                result = x / y;
                System.out.println(result);
                System.out.print("Exit? y/n: ");
                String breakOut = scanner.next();
                if (breakOut .equals("y") || breakOut.equals("Y")){
                    exit = true;
                }
            }
        }
    }
}
