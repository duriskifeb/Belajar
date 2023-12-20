package Belajar.Oop_ya;


public class KelasA {
 
    private int memberA = 5;
    private int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}

public class AccesModifier {
    public static void main(String[] args) {
        
        KelasA kelasA = new KelasA();

        System.out.println(kelasA.memberA);
        System.out.println(kelasA.fungctionB());
        // System.out.println(kelasA.memberA);
        
    }
}