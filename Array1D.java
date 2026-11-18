package PBOP6;
import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
public void Arr() {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah elemen: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah harus lebih dari 0");
            return;
        }

        int[] a = new int[n];

        int t = 0;
        int gj = 0;
        int gn = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + i + ": ");
            a[i] = input.nextInt();
            t += a[i];
        }

        int tbs = a[0];
        int tkc = a[0];

        int indexB = 0;
        int indexK = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] > tbs) {
                tbs = a[i];
                indexB = i;
            }

            if (a[i] < tkc) {
                tkc = a[i];
                indexK = i;
            }

            if (i % 2 == 0) {
                gn += a[i];
            } else {
                gj += a[i];
            }
        }

        double r = (double) t / n;

        System.out.println("Terbesar: " + tbs);
        System.out.println("Indeks terbesar: " + indexB);

        System.out.println("Terkecil: " + tkc);
        System.out.println("Indeks terkecil: " + indexK);

        System.out.println("Jumlah: " + t);
        System.out.println("Rata-rata: " + r);

        System.out.println("Jumlah indeks ganjil: " + gj);
        System.out.println("Jumlah indeks genap: " + gn);

        System.out.println("Hasil ganjil: "
                + (gj % 2 == 0 ? "Genap" : "Ganjil"));

        System.out.println("Hasil genap: "
                + (gn % 2 == 0 ? "Genap" : "Ganjil"));

        Arrays.sort(a);

        System.out.println("Array terurut: "
                + Arrays.toString(a));
    }
}    

