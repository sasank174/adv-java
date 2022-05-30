import java.util.*;


public class venkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strarray = str.split("");
        int f = 0;
        int s = 0;
        int r = 0;
        for (String c : strarray) {
            if (c.equals("{")){
                f++;
            }else if (c.equals("}")){
                f--;
            }else if (c.equals("[")){
                r++;
            }else if (c.equals("]")){
                r--;
            }else if (c.equals("(")){
                s++;
            }else if (c.equals(")")){
                s--;
            }else{
                break;
            }
        }
        if (f == 0 && r == 0 && s == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(String.join("-",strarray));
    }
}