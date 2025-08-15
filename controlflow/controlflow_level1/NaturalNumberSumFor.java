package controlflow_level1;
import java.util.Scanner;

class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            System.out.println("Formula sum: " + sumFormula);
            System.out.println("For loop sum: " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}

