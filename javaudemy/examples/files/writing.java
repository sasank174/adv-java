package javaudemy.examples.files;

import java.io.*;

public class writing {

    // public static void main(String[] args) {
    //     try {
    //         FileOutputStream w = new FileOutputStream("a.txt");
    //         BufferedOutputStream buffer = new BufferedOutputStream(w);
    //         int i = 65;
    //         String s = "my name is sasank \n";
    //         byte[] b = s.getBytes();
    //         buffer.write(b);
    //         buffer.write(b);
    //         buffer.write(b);
    //         // buffer.write("\n".getBytes());
    //         buffer.write(i);
    //         buffer.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }

    // }
    public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("output.txt");  
            String content = "I love my country \n";  
            w.write(content); 
            w.write(content); 
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}