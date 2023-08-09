// Inheritance

class Vehicle
{
    void move()
    {
        System.out.println("The vehicle is moving!!");
    }
}

class Jet extends Vehicle
{
    void fly()
    {
        System.out.println("The jet flies!!");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Jet plane = new Jet();

        plane.move();
        plane.fly();
    }
}