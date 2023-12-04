package Belajar.apalah;

import java.util.Scanner;

public class OperasiArray {
    public static void main(String[] args) {
        
        String kalimat = "Saya suka wiridan agar dekat dengan tuhan";

        // mengambil komponen dari String
        System.out.println(kalimat.charAt(5));

        // substring
        String kata = kalimat.substring(9,10);
        System.out.println(kata);

        // conenectacion (contact)
        String kalimat2 =  kata + "bakmi";
        System.out.println(kalimat2);

        kata = kata + "cireng";
        System.out.println(kata);

        // concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("wiridan", "combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // komparasi 
        String mobil1 = "apalah bahagia";
        String motor1 = "pokok gak turu";
        System.out.println(mobil1.compareTo(motor1));

        String mie1 = "ini saya berusaha";
        String mie2 = "ini kamu berusaha";
        System.out.println(mie2.compareTo(mie1));


        // equality / persamaan
        String kataInput = "test"; // ini ada di string pool
        // String kataInput = new String("test");
        String kataTest = "test"; // ini juga sama

        if (kataInput == kataTest) {
            System.out.println("sama");
        }else {
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("mengambil input String dari user : ");
        kataInput = userInput.nextLine();
        System.out.println("ini adalah input user : " + kataInput);

         if (kataInput.equals(kataTest)) {
            System.out.println("sama");
        }else {
            System.out.println("tidak sama");
        }

    }
}
