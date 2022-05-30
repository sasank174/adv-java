package javaudemy.examples.classes;

public class main1 {
    public static void main(String[] args) {
        main2 m = new main2();
        main2 m1 = new main2();
        m.setvalue(20);
        System.out.println(m.getvalue());
        m1.setvalue(20);
        System.out.println(m1.getvalue());
    }    
}
