package PBOP6;

import java.util.Scanner;
public class DaftarMhs {
       public void daftar() {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int j = input.nextInt();
        input.nextLine();

        String[] nama = new String[j];
        int[] nilai = new int[j];
        String[] status = new String[j];

        for (int i = 0; i < j; i++) {

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            input.nextLine();

            if (nilai[i] >= 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        System.out.println("\nDAFTAR NILAI MAHASISWA");

        for (int i = 0; i < j; i++) {
            System.out.println(
                (i + 1) + ". " + nama[i]
                + " | " + nilai[i]
                + " | " + status[i]
            );
        }
}
}
