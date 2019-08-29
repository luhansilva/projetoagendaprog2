/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class Comandos {
    
    public boolean sair(String mens, String titulo){
        if(JOptionPane.showConfirmDialog(null, mens, titulo, JOptionPane.YES_NO_OPTION) 
                == JOptionPane.YES_OPTION){
            return true;
        } else {
            return false;
        }
    }
    
}
