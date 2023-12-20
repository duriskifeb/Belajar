package Belajar.Oop_ya;

class MyThread extends ThreadOp {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + ThreadOp.currentThread().getId() + " - Iterasi " + i);
            try {
                // Menunggu sebentar untuk mensimulasikan pekerjaan yang berlangsung
                ThreadOp.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadOp {
    public static void main(String[] args) {
        // Membuat objek thread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Memulai eksekusi thread
        thread1.start();
        thread2.start();
    }
}

