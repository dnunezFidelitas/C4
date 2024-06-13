/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Persona {
    public String nombreCompleto;
    public int edad;
    public String id;
    
    public void hablar(){
        JOptionPane.showMessageDialog(null, nombreCompleto + "Esta halando");
    }
    
    public void caminando(){
        JOptionPane.showMessageDialog(null, nombreCompleto + "Esta caminando");
    }      
    
}
