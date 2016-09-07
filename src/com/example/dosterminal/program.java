package com.example.dosterminal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class program {

    public static void main(String[] args) {
        String fileName = "C:/Users/home/desktop/java/sample.txt";
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] data=new byte[1024*10];
            int i=0;
           while((i=is.read(data))!=-1)
           {
               System.out.println(i);
           } 
           is.close();
            
           
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

}
