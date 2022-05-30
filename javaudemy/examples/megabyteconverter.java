package javaudemy.examples;

public class megabyteconverter {
    public static void main(String[] args) {
        megabyte(2500);
    }
    public static void megabyte(int x) {
        if (x<0){
            System.out.println(x);
        }
        else{
            int mb=x/1024;
            int kb=x%1024;
            System.out.println(x);
            System.out.println(mb);
            System.out.println(kb);
        }
    }
}