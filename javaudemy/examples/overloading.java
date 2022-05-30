package javaudemy.examples;

public class overloading {
    public static void main(String[] args) {
        overload();
        overload(20);
        overload(20,50);
    }

    public static void overload() {
        System.out.println("default");
    }
    public static void overload(int x) {
        System.out.println(x);
    }
    public static void overload(int x,int y) {
        System.out.println(x);
        System.out.println(y);
    }
    
}
