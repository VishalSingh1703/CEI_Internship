import java.util.Scanner;
abstract class Student
{
    int duration;
    int credits;
    abstract int getCredits();
    abstract int getDuration();
}

class Btech extends Student
{
    int getCredits()
    {
        return 150;
    }
    int getDuration()
    {
        return 4;
    }
}

class Mtech extends Student
{
    int getCredits()
    {
        return 75;
    }
    int getDuration()
    {
        return 2;
    }
}

public class Abstraction
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.print("Enter 1 for BTech and 2 for MTech: ");
        choice = input.nextInt();
        input.close();
        Student obj;
        if(choice == 1)
        {
            obj = new Btech();
        }
        else
        {
            obj = new Mtech();
        }
        System.out.println("The duration and number of credits for you degree is: "+obj.getDuration()+" "+obj.getCredits());
    }
}