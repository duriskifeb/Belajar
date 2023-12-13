package Project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CRUD1 {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isiLanjutkan = true;

        while (isiLanjutkan) {

            System.out.println("\t____________________________");
            System.out.println("\t|   Database perpustakaan  |");
            System.out.println("\t|__________________________|");
            System.out.println("\t  |1. Lihat seluruh buku |");
            System.out.println("\t  |2. cari data buku     |");
            System.out.println("\t  |3. Tambah data buku   |");
            System.out.println("\t  |4. Ubah data buku buku|");
            System.out.println("\t  |5. hapus data buku    |");
            System.out.println("\t  |______________________|");
            
            System.out.print("\n\t   Pilihan anda : ");
            pilihanUser = terminalInput.next();
            System.out.println("\n=-=-=-=-=--=-=-=--=-=-=-=-=-=-=-=-=-=-=-=--=");

            switch (pilihanUser) {
                case "1":
                    System.out.println("____________________");
                    System.out.println("Lihat seluruh buku");
                    System.out.println("____________________");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("____________________");
                    System.out.println("Cari seluruh buku");
                    System.out.println("____________________");
                    break;
                case "3":
                    System.out.println("____________________");
                    System.out.println("Tambah data buku");
                    System.out.println("____________________");
                    break;
                case "4":
                    System.out.println("____________________");
                    System.out.println("Ubah seluruh buku");
                    System.out.println("____________________");
                    break;
                case "5":
                    System.out.println("____________________");
                    System.out.println("Hapus seluruh buku");
                    System.out.println("____________________");
                    break;
                default:
                    System.err.println("\nInputan anda tidak di temukan\nsilahkan pilih [1-5] ");
            }

            isiLanjutkan = getYesorNo("Apakah anda ingin melanjutkan");
            System.out.println();

        }
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("src\\Project1\\Database.txt");
            bufferInput = new BufferedReader(fileInput);

        } catch (Exception e) {
            System.err.println("Database tidak di temukan");
            System.err.println("Silahkan Tambah data terlebih dahulu");
            return;
        }

        String data = bufferInput.readLine();

        StringTokenizer stringToken = new StringTokenizer(data, ",");

        System.out.println("\n| No |\tTahun   |\tPenulis    |\tPenerbit     |\tjudul Buku" );
        stringToken.nextToken();

        System.out.printf("| %2d ", 1);
        
    }

    private static boolean getYesorNo(String messeage) {

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = terminalInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen() {

        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\123\123\123");
            }

        } catch (Exception e) {
            System.err.println("Tidak bisa clear screan...");
        }
    }
}
