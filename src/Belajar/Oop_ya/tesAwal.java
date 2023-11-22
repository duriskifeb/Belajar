package Belajar.Oop_ya;

import java.util.Scanner;

class Laptop {
  
  // buat 3 property untuk class Laptop
  String pemilik;
  String merk;
  double ukuranLayar;
  
  // buat 2 method untuk class Laptop
  String hidupkanLaptop() {
    return "Hidupkan Laptop";
  }
  
  String matikanLaptop() {
    return "Matikan Laptop";
  }
};
 
class BelajarJava {
 
  public static void main(String args[]){
     
    // buat object dari class Laptop (instansiasi)
    Laptop laptopAnto = new Laptop();
  
    // set nilai property
    laptopAnto.pemilik = "Anto";
    laptopAnto.merk = "Asus";
    laptopAnto.ukuranLayar = 15.6;
    
    // tampilkan property object Laptop
    System.out.println(laptopAnto.pemilik);
    System.out.println(laptopAnto.merk);
    System.out.println(laptopAnto.ukuranLayar);
    
    // tampilkan hasil method object Laptop
    System.out.println(laptopAnto.hidupkanLaptop());
    System.out.println(laptopAnto.matikanLaptop() );
  }
   
}