package Belajar.praktikArray;

public class prktk3 {
    
}

int jml=0;
while (jml<100) {
    System.out.print("No "+(jml+1)+". : ");
    int inputan = getRandom.nextInt(101);
    arList.add(inputan); //Penambahan data ke ArrayList
    jml++;
}

int a=0;
int arrMax = arList.size();
while (a<arrMax){
    //Mengambil nilai dari ArrayList pada index ke-a
    int nilai = arList.get(a);
    System.out.println("No"+(a+1)+". "+nilai);
    a++;
}
