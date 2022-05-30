package javaudemy.examples.files;

import java.io.*;

public class reading {
    // public static void main(String args[]){    
    //     try{    
    //       FileInputStream fin=new FileInputStream("a.txt");    
    //       BufferedInputStream bin=new BufferedInputStream(fin);    
    //       int i;    
    //       while((i=bin.read())!=-1){    
    //        System.out.print((char)i);    
    //       }    
    //       bin.close();    
    //       fin.close();    
    //     }catch(Exception e){System.out.println(e);}    
    // }
    
    public static void main(String[] args) {  
      try {  
          Reader reader = new FileReader("output.txt");  
          int data = reader.read();  
          while (data != -1) {  
              System.out.print((char) data);
              data = reader.read();
          }  
          reader.close();  
      } catch (Exception e) {  
          System.out.println(e.getMessage());  
      }  
  }
}
