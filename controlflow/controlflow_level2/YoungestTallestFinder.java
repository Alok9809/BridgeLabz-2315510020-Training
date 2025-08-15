package controlflow_level2;

import java.util.Scanner;

class YoungestTallestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();
        String youngest;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar < ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar > heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
        input.close();
    }
}

