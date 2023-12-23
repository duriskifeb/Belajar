package Project1.TugasBesar;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice;
        
        // Inisialisasi ArrayList untuk menyimpan data user
        ArrayList<User> userDatabase = new ArrayList<>();
        
        userDatabase.add(new User("user1", "USR1", "customer"));
        userDatabase.add(new User("admin1", "jancok", "admin"));
        clearScreen();

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // Proses login
        
            User loggedInUser = null;
            for (User user : userDatabase) {
                if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                    if (user.getRole().equals("admin")) {
                        Database.showMenuAdmin();
                        break;
                    } else {
                        loggedInUser = user;
                        break;
                    }
                }
            }
    
            if (loggedInUser != null) {
                System.out.println("\n[Login berhasil..] ");
                System.out.println("\n--o0 Selamat datag di aplikasi kami 0o--");
                if (loggedInUser.getRole().equals("customer")) {
                    displayCustomerMenu();
                    // Lakukan aksi untuk customer
                } else if (loggedInUser.getRole().equals("admin")) {
                    displayAdminMenu();
                    // Lakukan aksi untuk admin
                }
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        
    }
    
    
    
    public static void displayCustomerMenu() {
            //ga ono.?
        }

     public static void displayAdminMenu() {
        // ga ono.?
    }

    private static boolean getYesorNo(String messeage) {

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = terminalInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n") ) {
            
            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }
    

    private static boolean pilihYesatauNO(String messeage) {
        
        Scanner stasiunInput = new Scanner(System.in);
        
        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = stasiunInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n") ) {
            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = stasiunInput.next();
        }
        
        if (pilihanUser.equalsIgnoreCase("y")) {
            return true;
        }else {
            displayCustomerMenu();
            return false;
        }
    }
    
    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }
    
    private static void beliTiket() {
        // Logika untuk membeli tiket
        Scanner putin = new Scanner(System.in);
        
        
        System.out.println("Pilih Jenis Tiket Konser : ");
        System.out.println("1. Tiket Reguler");
        System.out.println("1. Tiket VIP");
        System.out.println("0. Tiket VVIP");

        System.out.print("Masukkan pilihan anda [1 - 2]");
        int milih = putin.nextInt();
        
        switch (milih) {
            case 1:
                System.out.println("Andah memilih tiket reguler");
                break;
            case 2:
                System.out.println("Andah memilih tiket reguler");
                break;
                case 0:
                System.out.println("Andah memilih tiket reguler");
                break;
                
                default:
                break;
        }
    }

    private static void lihatRiwayatPembelian() {
        // Logika untuk melihat riwayat pembelian
        System.out.println("Menampilkan riwayat pembelian...");
    }
    
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
    
    private static void showTiketReguler() {
        System.out.println("Isi tiket reguller : ");
        System.out.println("1. ");
        
    }

   
}

class costumer {
    
}

class ademin {
    private int availableTickets;

    public ademin(int initialTickets) {
        this.availableTickets = initialTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void increaseTickets(int amount) {
        if (amount > 0) {
            availableTickets += amount;
            System.out.println(amount + " tiket ditambahkan. \n\nTotal tiket adalah : "+ " " + availableTickets);
            System.out.println();
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void decreaseTickets(int amount) {
        if (amount > 0 && amount <= availableTickets) {
            availableTickets -= amount;
            System.out.println(amount + " tiket dihapus. \n\nTotal tiket yang tersedia : "+ " " + availableTickets);
            System.out.println();
        } else {
            System.out.println("\nMaaf . . .");
            System.out.println("Jumlah tiket yang akan dihapus tidak valid atau tiket yang tersedia tidak mencukupi.\n");
        }
    }
}


//  admin nambah ngurang 
// 