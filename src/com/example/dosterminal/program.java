package com.example.dosterminal;

import com.example.dosterminal.doscommand.DosCommand;
import com.example.dosterminal.doscommand.DosCommandFactory;
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
                
                String tokens[]=line.split(" ");
                DosCommand cmd = DosCommandFactory.get(tokens[0]);
                if (cmd!=null)
                        {
                        cmd.execute(tokens);
                        }
                else
                {
                    System.out.println(""+tokens[0]+"is not recognized as internal or external command");
                }
                
                System.out.print(path+">"
                        );
            
            }
            reader.close();
          
            
           
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

}
