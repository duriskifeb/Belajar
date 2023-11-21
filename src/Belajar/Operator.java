package semester1.Belajar;

import java.util.Scanner;

public class Operator {
    public static void main(String args[]){
       
    int Nilai;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("=================");
    System.out.print("Input nilai ujian: ");
    Nilai = input.nextInt();
    System.out.println("=================");
 
    if (Nilai >= 75) {
      System.out.println("Selamat, anda lulus!");
    }
    else {
      System.out.println("Maaf, silahkan coba lagi tahun depan");
    }
    
  }
}
