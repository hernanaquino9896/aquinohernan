import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Information
        String name = "Jenn";
        String color = "Pink";
        String animal = "Dog";
        String food = "Chicken";

        // Display the output
        System.out.println("I had a dream that " + name + " ate a "
                + color + " " + animal
                + " and said it tasted like " + food + "!");

        // Close Scanner
        input.close();
    }
}
