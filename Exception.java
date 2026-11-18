package PBOP6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception {
    public void RataRata() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Jumlah bilangan: ");
            int j = input.nextInt();

            if (j <= 0) {
                System.out.println("Jumlah harus lebih dari 0");
                return;
            }

            int[] a = new int[j];
            int t = 0;

            for (int i = 0; i < j; i++) {

                System.out.print("Angka ke-" + (i + 1) + ": ");
                a[i] = input.nextInt();

                t += a[i];
            }

            double r = (double) t / j;

            System.out.println("Total: " + t);
            System.out.println("Rata-rata: " + r);
            
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");

        }
    }
}    
