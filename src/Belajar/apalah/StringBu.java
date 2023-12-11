package Belajar.apalah;


import java.lang.StringBuilder;

public class StringBu {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);
        System.out.println();

        // append
        builder.append(" semuanya");
        printData(builder);
        System.out.println();
        
        builder.append(" warga Surabaya");
        printData(builder);
        System.out.println();
        
        // insert
        builder.insert(19," Kota");
        printData(builder);
        System.out.println();
        
        // delete
        builder.delete(19,24);
        printData(builder);
        System.out.println();
        
        // rubah character pada index tertentu
        builder.setCharAt(14,'W');
        printData(builder);
        System.out.println();
        
        // replace
        builder.replace(20,28,"Bandung");
        printData(builder);
        System.out.println();

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
        System.out.println();

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}

// sedikit catatan untuk string builder adalah fungsinya untuk merubah karakter string pada bhasa java.