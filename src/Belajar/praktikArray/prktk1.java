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
       

        System.out.println();
        System.out.println("---o0 H! 0o---");
        System.out.println("Input Data");
        for (int a = 0; a < 10; a++){
            
            System.out.print("Nilai "+(a+1)+" : ");
            arr[a]=sc.nextInt();
        }
        System.out.println();
    }

    public void viewData(){
       
        System.out.println("View Data");
        for (int a = 0; a < 10; a++){
            System.out.println("Nilai "+(a+1)+" : "+arr[a]);
        }
        System.out.println();
        System.out.println("---o0 Thank you 0o---");
    }
}
