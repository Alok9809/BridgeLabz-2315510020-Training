package controlflow_level2;

import java.util.Scanner;

class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
        input.close();
    }
}
