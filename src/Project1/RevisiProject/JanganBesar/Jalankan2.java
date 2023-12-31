package Project1.RevisiProject.JanganBesar;

import java.util.ArrayList;
import Project1.RevisiProject.JanganBesar.Jalankan;

public class Jalankan2 {
     public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();

        // Menambahkan objek Data ke ArrayList
        Data adminData = new Data();
        dataList.add(adminData);

        // Menjalankan menu admin untuk mengatur jumlah tiket
        adminData.showMenuAdmin();

        // Menjalankan menu customer menggunakan objek yang telah diatur oleh admin
        for (Data data : dataList) {
            Jalankan.displayAdminMenu();
        }
    }
}
