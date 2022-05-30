package javaudemy.examples.files;

import java.io.*;

class scequence {
    public static void main(String args[]) {
        try {
            FileInputStream input1 = new FileInputStream("a.txt");
            FileInputStream input2=new FileInputStream("a.txt");    
            SequenceInputStream inst=new SequenceInputStream(input1, input2);
            FileOutputStream fout=new FileOutputStream("b.txt");   
            int j;    
            while((j=inst.read())!=-1){    
             System.out.print((char)j);
             fout.write(j);
            }
            fout.close();
            inst.close();    
            input1.close();    
            input2.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }
  }    
}
