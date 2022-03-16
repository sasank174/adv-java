public class Stack{
    static final int Max = 100;
    int top;
    int a[] = new int[Max];
    boolean isEmpty(){
        return (top <0);
    }
    Stack(){
        top = -1;
    }
    boolean push(int x){
        if(top >= (Max -1)){
            System.out.println("Stack overflow while push");
            return false;
        }else{
            a[++top]=x;
            System.out.println("The elements pushed into Stack are  "+x);
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow while pop");
            return 0;
        }else{
            int x =a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Underflow condition");
            return 0;
        }else {
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top;i>-1;i--){
            System.out.println(a[i]+ "  ");
        }
    }

    public static void main(String[] agrs){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("peek method " +  s.peek());
        System.out.println("pop method "+ s.pop());
        s.print();
    }
}