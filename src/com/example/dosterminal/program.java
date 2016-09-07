
package com.example.dosterminal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class program {

   
    public static void main(String[] args) {
        String fileName="C:/Users/home/desktop/java/sample.txt";
        try
        {
        int i=0;
       FileReader reader=new FileReader(fileName);
        while((i=reader.read())!=-1)
      {
          System.out.print((char)i);
      
      }
        reader.close();
        }catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        
        }
  
       
    }
    
}
