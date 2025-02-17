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

    public void addAName(A aName){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a name for the object: ");
        String stringAName = userInput.nextLine();
        aName.setAName(stringAName);
    }

    public void addAAge(A aObjectAge){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the age of the object: ");
        String stringAAge = userInput.nextLine();
        aObjectAge.aAge = Integer.parseInt(stringAAge);
    }
}