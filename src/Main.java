import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my quiz, do you want to continue? (Y/N) ");
        String yn = sc.nextLine();
        System.out.println("--------------------------");
        if (yn.equals("Y")) {
            System.out.println("How many titles corinthians have in Paulista Championship?");
        } else {
            System.out.println("Thanks for testing my code :)");
            System.exit(0);
        }

        int rc = sc.nextInt();
        sc.nextLine();

        if (rc == 30) {
            System.out.println("That's right!");
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        System.out.println("--------------------------");

        System.out.println("What's the name of the man that did the enigma machine to discover nazist communication codes?");

                     String AT = sc.nextLine();

                     if (AT.equals("Alan Turing")) {
                         System.out.println("That's right!");
                     } else {
                         System.out.println("Wrong, try again!");
                         System.exit(0);
                     }

        System.out.println("--------------------------");

        System.out.println("Is the creator of this code beautiful? (Y/N)");

        String B = sc.nextLine();

        if (B.equals("Y")) {
            System.out.println("That's right! (THE END!)");
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        System.out.println("--------------------------");

        LocalDate lc = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date that you used this program: " + lc.format(formatter));
    }
}













