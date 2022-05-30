package javaudemy.examples;

public class dogbarking {
    public static void main(String[] args) {
        System.out.println(bark(true, 8));
    }
    public static boolean bark(boolean x,int y) {
        if(x){
            if(y<0||y>23){
                return false;
            }
            if(y<8 || y>22){
                return true;
            }
        }
        return false;
    }
}
