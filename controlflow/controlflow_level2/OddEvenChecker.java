package controlflow_level2;

import java.util.Scanner;

class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        input.close();
    }
}

