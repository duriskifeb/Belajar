package Belajar.Oop_ya;

public class construktor {
    // Variabel instance (atribut)
    String brand;
    String model;
    int year;

    // Constructor tanpa parameter
    public construktor() {
        // Inisialisasi nilai default
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor dengan parameter
    public construktor(String brand, String model, int year) {
        // Menggunakan parameter untuk menginisialisasi nilai
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Metode untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan constructor tanpa parameter
        construktor car1 = new construktor();
        car1.displayInfo();

        // Membuat objek menggunakan constructor dengan parameter
        construktor car2 = new construktor("Toyota", "Camry", 2022);
        car2.displayInfo();
    }
}
