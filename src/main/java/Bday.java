import java.util.Scanner;

public class Bday {

    public static void main(String[] args) {

        System.out.println("Hi!");
        Scanner input = new Scanner(System.in);

        String correctHi = "Hi";
        String greatings = input.nextLine();
        if (greatings.equals(correctHi)) {
            System.out.println("Nice to meet You. So it's Your Bday today?");
        } else {
            System.out.println("Can u at least say 'Hi'??");
            }
        }
    }
