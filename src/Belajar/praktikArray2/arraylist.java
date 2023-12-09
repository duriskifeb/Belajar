package Belajar.praktikArray2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arraylist {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int total = 0;

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Input Data");
        String lagi = "y";
        int n = 0;

        try {
            while ((lagi.equals("y")) || (lagi.equals("y"))) {
                System.out.print("Inputan " + (n+1) + " = ");
                arr[n] = Integer.parseInt(input.readLine());
                n++;
                System.out.println("Input Lagi Tekan [y / n]" );
                lagi = input.readLine();
                System.out.println("value lagi" + lagi);
            }   
        } 
        catch (Exception e) {
            System.out.println("Something error " + e.toString());
        }

        System.out.println(" Tampilkan Data anda ");
        for (int a = 0; a < n; a++) {
            System.out.println(arr[a]);
            total = total + arr[a];
        }
        System.out.println(" = " + total);

        try {
            System.out.println(arr[100]);
        } catch (Exception e) {
            System.out.println("maaf error...");
        }
        System.out.println("pesan yang anda tersebut error..!!!");
    }
}
