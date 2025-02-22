import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        //Text here For git Test
        System.out.println("Hello and welcome!");
        ArrayList<A> aList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        // Populate the list
        populateListOfA(aList, userInput, numberOfTries(userInput));

        userInput.close();

        // Display the list
        displayUsers(aList);
    }



    public static int numberOfTries(Scanner userInput) {
        System.out.print("Enter the number of items you want to add: ");
        return Integer.parseInt(userInput.nextLine().trim());
    }

    public static void populateListOfA(ArrayList<A> aList, Scanner userInput, int numberOfTries) {
        for (int i = 1; i <= numberOfTries; i++) {
            A newA = new A();
            newA.addAName(userInput);
            newA.addAAge(userInput);
            aList.add(newA);
        }
    }

    public static void displayUsers(ArrayList<A> aList) {
        if (aList.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        for (A aItems : aList) {
            System.out.println("Name: " + aItems.getAName() + ", Age: " + aItems.getAge() + ", Created At: " + aItems.formatedCreatedAt());
        }
    }

}

