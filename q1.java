// Multiple inheritance is not possible using classes in Java
// We should use interface to achieve multiple inheritance like below:

interface Mammals {
    default void print()
    {
        System.out.println("I am mammal");
    }
}
 
// Interface 2
interface MarineAnimals {
 
    default void print()
    {
        System.out.println("I am a marine animal");
    }
}

public class BlueWhale implements Mammals, MarineAnimals {

    public void print()
    {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
 

    public static void main(String args[])
    {
        BlueWhale bw = new q1();
       bw.print();
    }
}