package Belajar.apalah;

import java.io.FileInputStream;
import java.io.IOException;

public class kenalBuffer {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fileInput = new FileInputStream("src\\Belajar\\apalah\\input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
    }
}
