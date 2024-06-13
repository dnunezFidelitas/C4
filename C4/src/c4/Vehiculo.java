/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4;

/**
 *
 * @author viti
 */
public class Vehiculo {
    public String placa;
    public String modelo;
    public int anioCreacion;

    public void calculaAnios(int anioActual) {
        int resultado = 0;
        resultado = anioActual - anioCreacion;
        System.out.println("Antiguedad del vehiculo " + resultado);
    }
    
    public int calculaAniosResultado(int anioActual){
        return 0;
    }

    
}
