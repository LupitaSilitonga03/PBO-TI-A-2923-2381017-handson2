package binaryoperator;

public class perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //sama dengan
        boolean hasilsamadengan = (a==b);
        System.out.println("a ==b: " + hasilsamadengan);

        //tidak dengan sama dengan
        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != b: " + hasilTidakSamaDengan);

        //lebih besar dari
        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b: " + hasilLebihBesarDari);

        //Lebih kecil dari
        boolean hasilLebihKecilDari = (a < b);
        System.out.println("a < b: " + hasilLebihKecilDari);

        //lebih besar atau sama dengan
        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b: " + hasilLebihBesarSamaDengan);

        //Lebih kecil atau sama dengan
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b: " + hasilLebihKecilSamaDengan);
    }
}
