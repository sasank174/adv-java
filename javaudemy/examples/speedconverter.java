package javaudemy.examples;

public class speedconverter {
    public static void main(String[] args) {
        System.out.println(milestone(10.25));
    }
    public static long milestone(double x) {
        if(x<0){
            return -1;
        }
        else{
            return Math.round(x/1.609);
        }
    }
}
