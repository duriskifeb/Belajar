package Belajar.Latihan1;
import java.util.HashMap;
import java.util.Map;

class Planet {
    private String name;
    private double mass;
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}


public class MapList {
    public static void main(String[] args) {
        
        // menggunakan HashMap
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key-1", new Planet("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama
        planets.put("key-4", new Planet("Pluto", 0.10)); // menambahkan ke Map dengan key yang sama
        System.out.println();

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map planets awal: (size = "+ planets.size() +")");
        for (String key : planets.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }
        System.out.println();
        
        planets.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map
        
        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (Planet planet : planets.values()) { // looping value dari Map
            System.out.println("\t " + planet);
        }
        System.out.println();
    }
}

 
 