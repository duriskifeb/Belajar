package BroCode.Bagian1.Smstr2;

public class Sstatic {

    String name;
    static int numberOFFriends;

    Sstatic(String name) {
        this.name = name;
        numberOFFriends++;
}

static void displayFriend() {
    System.out.println("Kamu punya teman  " + numberOFFriends +  " orang");
}

}
