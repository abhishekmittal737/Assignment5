public class Myclass {
    static int a = 20;
    Myclass() {
    a++;
    }
    Void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    Myclass obj = new Myclass();
    Myclass obj2 = new Myclass();
    Myclass obj3 = new Myclass();
    obj3.m1();
    }
}

Output: Error // Void is a class cannot be used as return type