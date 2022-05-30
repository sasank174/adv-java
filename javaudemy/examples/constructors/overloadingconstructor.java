package javaudemy.examples.constructors;

class overloadingconstructor{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    overloadingconstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    overloadingconstructor(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    overloadingconstructor s1 = new overloadingconstructor(111,"Karan");  
    overloadingconstructor s2 = new overloadingconstructor(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
} 