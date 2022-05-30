package javaudemy.examples.inheritance;

public class main2 {
    void app1() {
        System.out.println("main2");
    }
}
class main3 extends main2 {
    void app2(){
        System.out.println("main3");
    }
    void app2(int x){
        System.out.println("main3"+x);
    }
}
