package semester1.Belajar;

import java.util.Scanner;

public class Main {
    

        Scanner input = new Scanner(System.in);   

        static void sapaRiski(){
        System.out.println("hallo, riski gimana kabarnya masih semangat kan...");
    }

    static void sapaZiaa(){
        System.out.println("hallo, zia sepuh telkom semangatnya luar biasa..");
    }

    static void hitungNilaiRapor(){
        double ipa = 50;
        double ips = 45;
        double hasil = (ipa * ips / 2);
        System.out.println("jumlah nilainya adalah : " + hasil);
    }

    static void nyapaTeman(String nama){
        System.out.println("assalamualaikum : " + nama);
    }

    static void hitungKotakAmal(int banyak, int sedikit){
        double totalnya = (banyak * sedikit) / 100;
        System.out.println("hasil kotak amal hari ini : " + totalnya);
    }

    
    


    public static void main(String[] args) {
        sapaRiski();
        sapaZiaa();
        hitungNilaiRapor();
        nyapaTeman("riski");
        nyapaTeman("david");
        nyapaTeman("kafid");
        nyapaTeman("Sauqi");
        nyapaTeman("ziaa");
        nyapaTeman("yanto");
        hitungKotakAmal(1000, 500);
        hitungKotakAmal(20, 5);
        hitungKotakAmal(96, 20);
    }        

}

    


        
        
