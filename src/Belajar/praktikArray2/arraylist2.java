package Belajar.praktikArray2;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        int total = 0;

        al.add(1);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

        System.out.println("ukuranya : " + al.size());
        System.out.println("index 1 : " + al.get(1));

        System.out.println("Excute insert");
        al.add(1, 50);
        System.out.println("index 1 : " + al.get(1));
        System.out.println("size : " + al.size());

        System.out.println("search index dengan value 11 : " + al.indexOf(11));
        System.out.println("search index dengan value 11 : " + al.contains(11));
        
        System.out.println("search index dengan value 10 : " + al.indexOf(10));
        System.out.println("search index dengan value 10 : " + al.contains(10));

        System.out.println("Tampilkan data");
        for ( int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            total = total + al.get(i);
        }
        System.out.println(" = " + total);
    }
}
