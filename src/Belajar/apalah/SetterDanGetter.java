package Belajar.apalah;

public class SetterDanGetter {
    public static void main(String[] args) {
        riski febri = new riski();
        int y = febri.getx();
        febri.setX(99);
        System.out.println(y);
        System.out.println(y);
    }
}

class riski{
    private int x = 10;

    public void setX(int x) {
        this.x = x;

    }

    public int getx() {
        return x;
    }

    

}



// get - tipe data - nama method 
// set - void