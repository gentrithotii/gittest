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
        aName = "empty";
        aAge = 0;
    }

    public A(String name, int age){
    aName = name;
    aAge = age;
    }

    public void addAName(Scanner userInput){
        System.out.print("Enter a name for the object: ");
        String stringAName = userInput.nextLine();
        this.setAName(stringAName);
    }

    public void addAAge(Scanner userInput){
        System.out.print("Enter the age of the object: ");
        String stringAAge = userInput.nextLine();
        this.aAge = Integer.parseInt(stringAAge);
    }
}