package latihansoal;
import java.util.Scanner;

public class soal2 {

        public static void main(String[] args) {
            int[] bilangan = new int[3];
            Scanner input = new Scanner(System.in);

            System.out.println("Masukkan Bilangan Pertama: ");
            bilangan[0] = input.nextInt();

            System.out.println("Masukkan Bilangan Kedua: ");
            bilangan[1] = input.nextInt();

            System.out.println("Masukkan bilangan ketiga");
            bilangan[2] = input.nextInt();

            if (bilangan[0] >= bilangan[1] && bilangan [0] >= bilangan[2]) {
                System.out.println("Bilangan terbesar adalah: " + bilangan[0]);
            } else if (bilangan[1] >= bilangan[0] && bilangan[1] >= bilangan [2]) {
                System.out.println("Bilangan terbesar adalah: " + bilangan[1]);
            } else {
                System.out.println("Bilangan terbesar adalah : " + bilangan[2]);
            }

            input.close();
        }
    }