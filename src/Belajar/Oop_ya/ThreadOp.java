package Belajar.Oop_ya;


// Kelas MyThread yang mewarisi kelas Thread
class MyThread extends Thread {
    // Metode run() yang akan dijalankan saat thread dimulai
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " - Iterasi " + i);
            try {
                // Menunggu sebentar untuk mensimulasikan pekerjaan yang berlangsung
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Kelas utama untuk menjalankan program
public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program Utama Dimulai");

        // Membuat objek thread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Memulai eksekusi thread
        thread1.start();
        thread2.start();

        System.out.println("Program Utama Selesai");
    }
}
