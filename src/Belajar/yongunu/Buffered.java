package Belajar.yongunu;

import java.io.IOException;
import java.io.FileInputStream;

public class Buffered {
    public static void main(String[] args) throws IOException {
        
        FileInputStream byteInput = new FileInputStream("kacong.txt");
        System.out.println(byteInput.available());
    }
}
