/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Rentar {
    public Date fechaInicio;
    public Date fechaFin;
    public Persona persona;
    public Vehiculo auto;
    public double monto;
    
    public void crearReserva(){
        JOptionPane.showMessageDialog(null, "Se crea una reserva " );
    }
    
}
