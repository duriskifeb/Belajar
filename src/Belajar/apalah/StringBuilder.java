package Belajar.apalah;
import java.lang.StringBuilder;

public class StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("halo");
        System.out.println("data = " + builder);
        System.out.println("panjang = " + builder.length());  // Perbaikan: length, bukan lenght
        System.out.println("kapasitas = " + builder.capacity());  // Perbaikan: capacity, bukan capacityy
    }
}
