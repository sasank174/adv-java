package javaudemy.examples.constructors;

public class exam2 {
    int width;
    int height;
    exam2(){
        System.out.println("no parameters");
    }
    exam2(int x,int y){
        if(x<0){
            this.width=0;
        }else{
            this.width=x;
        }
        if(y<0){
            this.height=0;
        }else{
            this.height=y;
        }
    }
	public int getarea() {
		return this.height*this.width;
	}
}
