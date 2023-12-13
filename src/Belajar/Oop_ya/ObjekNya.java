package Belajar.Oop_ya;

public class  {
    public void cetakNama(String nama) {
        System.out.println("Nama hewan: " + nama);
    }
}

public class ObjekNya {
    public static void main(String[] args) {
        // menciptakan object dengan nama 'objekHewan'
        ObjekNya1 objekHewan = new ObjekNya1();
        objekHewan.cetakNama("Elang");
    }
}