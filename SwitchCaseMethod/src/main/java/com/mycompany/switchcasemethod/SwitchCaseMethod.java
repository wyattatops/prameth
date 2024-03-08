package com.mycompany.switchcasemethod;

import java.util.Scanner;

public class SwitchCaseMethod {

    Scanner sc = new Scanner(System.in);
    String choice = "";
    int num1 = 0, num2 = 0;
    boolean start = true;

    public SwitchCaseMethod() {
        
            System.out.println("Kindly choose an operation you wish to use.");
            System.out.println("[A]ddition");
            System.out.println("[S]ubtraction");
            System.out.println("[M]ultiplication");
            System.out.println("[D]ivision");
            System.out.println("[X]Exit calculator");
            System.out.print("Choice >>: ");
            choice = sc.nextLine().toUpperCase();

            while (start) {
            switch (choice) {
                case "A":
                    getTwoNum();
                    int sum = getSum(num1, num2);
                    System.out.println("The sum is " + sum);
                    break;
                case "S":
                    getTwoNum();
                    int diff = getDiff(num1, num2);
                    System.out.println("The difference is " + diff);
                    break;
                case "M":
                    getTwoNum();
                    int prod = getProd(num1, num2);
                    System.out.println("The product is " + prod);
                    break;
                case "D":
                    getTwoNum();
                    double quo = getQuo(num1, num2);
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Input Error.");
                    } else {
                        System.out.println("The quotient is " + quo);
                        break;
                    }
                case "X":
                    start = false;
                    System.out.println("Thank you for using my calculator!.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void getTwoNum() {
        int num1 = 0, num2 = 0;
        System.out.print("Enter first number >>: ");
        this.num1 = sc.nextInt();
        System.out.print("Enter second number >>: ");
        this.num2 = sc.nextInt();
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public int getDiff(int num1, int num2) {
        return num1 - num2;
    }

    public int getProd(int num1, int num2) {
        return num1 * num2;
    }

    public double getQuo(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        SwitchCaseMethod m = new SwitchCaseMethod();
    }
}
