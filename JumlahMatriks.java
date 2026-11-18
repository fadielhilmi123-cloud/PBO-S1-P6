package PBOP6;

import java.util.Scanner;

public class JumlahMatriks {
    public void jumlah() {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah baris: ");
        int b = input.nextInt();

        System.out.print("Jumlah kolom: ");
        int k = input.nextInt();

        int[][] A = new int[b][k];
        int[][] B = new int[b][k];
        int[][] C = new int[b][k];

        System.out.println("Matriks A:");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks B:");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil penjumlahan:");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}    

