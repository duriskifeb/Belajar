package Belajar.Project1;

import javax.swing.JOptionPane;


public class sangar {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Masukkan Nama anda");
        JOptionPane.showMessageDialog(null, "Hallo", name, 0);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nama i"));
        JOptionPane.showMessageDialog(null, "i kamu adalah", age, "age nya kamu adalah");

        double j = Double.parseDouble(JOptionPane.showInputDialog("Masukkan j anda "));
        JOptionPane.showMessageDialog(null, "j nya kamu adalah", j, "ya itu j kamau");
    }
}
