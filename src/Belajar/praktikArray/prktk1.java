package Belajar.praktikArray;

import java.util.Scanner;

class prktk1 {
    int arr[] = new int[10];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        prktk1 ca = new prktk1();
        ca.inputData();
        ca.viewData();
    }

    public void inputData(){
        int a=0;

        System.out.println();
        System.out.println("---o0 H! 0o---");
        System.out.println("Input Data");
        while (a<10){
            System.out.print("Nilai "+(a+1)+" : ");
            arr[a]=sc.nextInt();
            a++;
        }
        System.out.println();
    }

    public void viewData(){
        int a=0;
        System.out.println("View Data");
        while (a<10){
            System.out.println("Nilai "+(a+1)+" : "+arr[a]);
            a++;
        }
        System.out.println();
        System.out.println("---o0 Thank you 0o---");
    }
}
