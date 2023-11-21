package semester1.Belajar;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        String input;

        System.out.print("celuk'en jeneng e sopo : ");
        input = inputUser.next();

        switch (input) {
            case "rizky":
                System.out.println("Rizky febriyanto hadir pak...");
                break;

            case "rizal":
                System.out.println("Rizal rahmatulloh hadir pak....");
                break;

            case "dapid":
                System.out.println("Dapid hardiansyah hadir pak....");
                break;

        
            default:
                System.out.println(input + " hari ini tidak hadir pak....");
                break;
        }
    }
}
