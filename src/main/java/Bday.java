import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bday {

    public static void main(String[] args) {

        System.out.println("Hi!");
        Scanner input = new Scanner(System.in);

        Set<String> greetings = new HashSet<String>();
        greetings.add("Hi");
        greetings.add("Hello");
        greetings.add("Hey");
        greetings.add("What's up");
        String textInput = input.nextLine();
        if (greetings.contains(textInput)) {
            System.out.println("Nice to meet You. So it's Your Bday today?\n" + "Yes or No?");
        } else {
            System.out.println("Can u at least say 'Hi'??");
            }
        textInput = input.nextLine();
        if (textInput.equals("Yes")) {
            System.out.println("Happy Bday! I wish You all best!");
        }else if (textInput.equals("No")) {
            System.out.println("Well, sorry to bother You! Good luck anyway!");
        }else {
            System.out.println("Sorry, I don't get it. So it's Your Bday today?\n" + "Yes or No?");
        }
        }
    }
