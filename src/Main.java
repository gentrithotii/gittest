import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean loopi = false;
        System.out.println("Hello and welcome!");
//        int menuPicked = 0;
        ArrayList<A> aList = new ArrayList<>();
        int numberOfThingsToAdd = 0;
//        A newAItem = new A();
//        newAItem.setAName("Gentrit");
//        newAItem.setAge(1);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the amount of items you want to add: ");
        String stringNum = userInput.nextLine();
        numberOfThingsToAdd = Integer.parseInt(stringNum);


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


        for(A aItems : aList){
            System.out.print( " " + aItems.getAName() + " " + aItems.getAge() );
        }
       /* while(!loopi){
            Scanner getNameForObject = new Scanner(System.in);
            System.out.print("Enter the name you want to give to the object: ");
            String objectName = getNameForObject.nextLine();
            A aPerson = new A();
            aPerson.setAName(objectName);
            String test = aPerson.getAName().toLowerCase();
            String keyWord = "Gentrit".toLowerCase();
        for (int i = 1; i <= 5; i++) {
            if(test.contains(keyWord)){
            System.out.println("i = " + i);
            loopi = true;
            }
        }
        }
        */


//        int [] numbers = {1, 3, 4, 6, 7, 2, 9, 12, 1, 52};

    }
}
