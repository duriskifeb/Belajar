package Project1.praTugasBesar;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Registrastion registration = new Registrastion();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pengguna yang ingin didaftarkan: ");
        int jumlahPengguna = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        for (int i = 0; i < jumlahPengguna; i++) {
            System.out.println("\nPendaftaran Pengguna ke-" + (i + 1));
            registration.registerUser();
        }

        // Dapatkan daftar pengguna dan peran mereka
        List<User> users = registration.getUsers();
        for (User user : users) {
            System.out.println("\nUsername: " + user.getUsername());
            System.out.println("Roles: " + user.getRoles());
        }
    }
}
