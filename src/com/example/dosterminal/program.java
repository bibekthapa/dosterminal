package com.example.dosterminal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class program {

    public static void main(String[] args) {
        String fileName = "C:/Users/home/desktop/java/sample.txt";
        try {
            InputStream is = new FileInputStream(fileName);
            OutputStream os=new FileOutputStream(fileName +"_copy.txt");
            byte[] data=new byte[1024*10];
            int i=0;
           while((i=is.read(data))!=-1)
           {
               os.write(data, 0, i);
           } 
           is.close();
           os.close();
            
           
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

}
