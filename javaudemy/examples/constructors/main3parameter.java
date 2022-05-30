package javaudemy.examples.constructors;

public class main3parameter {
    int id;
    public main3parameter(int i) {
        this.id=i;
    }

    public static void main(String[] args) {
        main3parameter m = new main3parameter(10);
        m.display();
    }

    private void display() {;
        System.out.println(this.id);
    }
}
