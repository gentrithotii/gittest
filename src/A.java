import java.util.Scanner;

public class A
{
    private String aName;
    private int aAge;


    public  String getAName() { return aName; }
    public void setAName(String aName){ this.aName = aName; }

    public int getAge(){ return aAge; }
    public void setAge(int age){ this.aAge = age; }

    public A(){
        this.aName = "empty";
        this.aAge = 0;
    }

    public A(String name, int age){
    this.aName = name;
    this.aAge = age;
    }

    public void addAName(Scanner userInput){

        boolean loopiSan = true;

        while(loopiSan){

            System.out.print("Enter a name for the object: ");
        try{

            String stringAName = userInput.nextLine();
            this.setAName(stringAName);
            loopiSan = false;

        }catch(Exception e){

            System.out.println("Error enter a string please!");
        }

        }

    }

    public void addAAge(Scanner userInput){

        boolean loopiSan =true;

        do{
        System.out.print("Enter the age of the object: ");
        try{

        int convertedNum = Integer.parseInt(userInput.nextLine());
        this.setAge(convertedNum);
        loopiSan = false;

        } catch (NumberFormatException e){

            System.out.println("Invalid input. Enter a number");

        }
        }
        while (loopiSan);

    }
}