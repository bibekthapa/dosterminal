package com.example.dosterminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class program {

    public static void main(String[] args) {
        String fileName = "C:/Users/home/desktop/java/sample.txt";
        try {
            BufferedReader reader =new BufferedReader(new FileReader(fileName));
            String line="";
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            
            }
            reader.close();
          
            
           
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

}
