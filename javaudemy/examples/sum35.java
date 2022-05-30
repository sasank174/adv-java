package javaudemy.examples;

public class sum35 {
    public static void main(String[] args) {
        int x=0,count=0;
        for(int i=1;i<1000;i++){
            if (i%3==0 && i%5==0) {
                count++;
                x=x+i;
                System.out.println(i);
        }
        if (count==5) {
            break;
        }
    }
    System.out.println(x);
    }
}
