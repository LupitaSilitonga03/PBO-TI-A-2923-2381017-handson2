package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args){
     int x = 10;
     boolean benar = true;

     //Minus dan plus operator
        //system.out.println(-x);
        //system.out.println(+x);

        //Pre - Increment
        System.out.println("PRE - INCREMENT ; TAMBAH DULU BARU DICETAK");
        System.out.println("x awal : " + x);
        System.out.println("++x : " + ++x);
        System.out.println("setelah x : " + x);

        //Post -Increment
        //system.out.println("POST - INCREMENT : CETAK DULU BARU DI TAMBAHIN");
        //system.out.println("x awal : " + x);
        //system.out.println("x++ : " + x++);
        //system.out.println("setelah x : " + x);

        // Boolean
        System.out.println("value variable !benar : "+ !benar);
    }
}
