package controlflow_level2;

import java.util.Scanner;

class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer less than 100.");
        }
        input.close();
    }
}

