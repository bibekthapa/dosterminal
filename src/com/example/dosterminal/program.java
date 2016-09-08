package com.example.dosterminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {

    public static void main(String[] args) {
        String fileName = "C:/Users/home/desktop/java/sample.txt";
        
        try {
            File pwd =new File(".");
            String path = pwd.getAbsolutePath();
            BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
            String line="";
            System.out.print(path+">");
            while(!(line=reader.readLine()).equalsIgnoreCase("exit"))
            {
                System.out.println(line);
                System.out.print(path+">"
                        );
            
            }
            reader.close();
          
            
           
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

}
