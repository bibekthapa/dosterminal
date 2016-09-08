/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dosterminal.doscommand;

/**
 *
 * @author HOME
 */
public class DosCommandFactory {
    
    public static DosCommand get(String key)
    {
       if(key.equalsIgnoreCase("md"))
       {
           return new MdCommand();
       }
       else if(key.equalsIgnoreCase("cd"))
               {
                   return new CdCommand();
               }
       else if(key.equalsIgnoreCase("rd"))
               {
                   return new RdCommand();
               }
       else if(key.equalsIgnoreCase("copy"))
               {
                   return new CopyCommand();
               }
       else if(key.equalsIgnoreCase("rename"))
               {
                   return new RenameCommand();
               }
       else if(key.equalsIgnoreCase("type"))
               {
                   return new TypeCommand();
               }
       else 
           return null;
    
    
    }
    
}
