import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class A
{
    private String aName;
    private int aAge;
    private final LocalDateTime createdAt;

    public  String getAName() { return aName; }

    public int getAge(){ return aAge; }
    public void setAge(int age){ this.aAge = age; }

    public A(){
        this.aName = "empty";
        this.aAge = 0;
        this.createdAt = LocalDateTime.now();
    }

    public A(String name, int age){
    this.aName = name;
    this.aAge = age;
    this.createdAt = LocalDateTime.now();
    }
    public String formatedCreatedAt(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        return this.createdAt.format(formatter);
    }

    public void addAName(Scanner userInput){

        boolean loopiSan = true;

        do{

            System.out.print("Enter a name for the object: ");
        try{

            this.aName = userInput.nextLine().trim();
            loopiSan = false;

        }catch(Exception e){

            System.out.println("Error enter a string please!");
        }

        }while(loopiSan);

    }

    public void addAAge(Scanner userInput){

        boolean loopiSan =true;

        do{
        System.out.print("Enter the age of the object: ");
        try{

        int convertedNum = Integer.parseInt(userInput.nextLine().trim());
        this.setAge(convertedNum);
        loopiSan = false;

        } catch (NumberFormatException e){

            System.out.println("Invalid input. Enter a number");

        }
        }
        while (loopiSan);
    }
}