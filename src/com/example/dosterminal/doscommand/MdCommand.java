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
public class MdCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
        
        if (params.length>1)
        {
        
        }
        else
        {
            System.out.println("The syntax of the command is incorrect");
        
        }
        
        
    }
    
}
