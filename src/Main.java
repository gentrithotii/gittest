import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        ArrayList<A> aList = new ArrayList<>();
        int numberOfThingsToAdd = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of items you want to add: ");

        try{
        String stringNum = userInput.nextLine();
        numberOfThingsToAdd = Integer.parseInt(stringNum);
        }catch(NumberFormatException e){
            System.out.println("Error m8 enter a number :))))))))))");
        }


        for(int i = 1; i <= numberOfThingsToAdd ; i++)
        {
            A newA = new A();

            //Add object name
            newA.addAName(userInput);

            //Add object age
            newA.addAAge(userInput);

            //Add the object to the aList
            aList.add(newA);
        }

        userInput.close();

        for(A aItems : aList){
            System.out.print( " " + aItems.getAName() + " " + aItems.getAge() );
        }

    }
}
