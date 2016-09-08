/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dosterminal.doscommand;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author HOME
 */
public class RenameCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
        
        if (params.length>1)
        {
        File srcfile=new File(params[1]);
        File destfile=new File(params[2]);
        srcfile.delete();
        destfile.mkdir();
        }
        else
        {
        System.out.println("The syntax of the command is incorrect");
        }
        
       
    }
    
}
