package latihansoal;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan Pertama: ");
        bilangan[0] = input.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        bilangan[1] = input.nextInt();

        if (bilangan[1] > bilangan[0]) {
            System.out.println("Bilangan terbesar adalah: " + bilangan[1]);
        } else if (bilangan[0] > bilangan[1]) {
            System.out.println("Bilangan terbesar adalah: " + bilangan[0]);
        } else {
            System.out.println("Kedua bilangan sama besar.");
        }

        input.close();
    }
}
