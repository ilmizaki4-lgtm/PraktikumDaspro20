import java.util.Scanner;

public class StudiKasus120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga=18000,jumlahCup,uangBayar,totHarga;
        double diskon,totBayar,kembalian,kurang;

        System.out.println("Masukkan jumlah cup");
        jumlahCup=sc.nextInt();
        System.out.println("Masukkan uang bayar");
        uangBayar=sc.nextInt();
        
        totHarga=jumlahCup*harga;
        
        if (totHarga >= 100000) {
            diskon=totHarga*0.1;
        } else {
            diskon=0;
        }
        totBayar =totHarga-diskon;

        System.out.println("Total harga " + totHarga);
        System.out.println("Total Bayar " + (int)totBayar);
        System.out.println("Diskonnya " + (int)diskon);

        if (uangBayar >= totBayar) {
            kembalian=uangBayar-totBayar;
            System.out.println("Kembaliannya " + (int)kembalian);
        } else {
            kurang=totBayar-uangBayar;
            System.out.println("Uang tidak cukup,kurang Rp. " + (int)kurang);
        }
    }
}