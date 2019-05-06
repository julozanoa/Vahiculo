/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class AutoCompacto extends Vehiculo{
    private int numPasajero;

    public AutoCompacto(int numPasajero, String placa, int numSerie, String marca, int anio, double precio) {
        super(placa, numSerie, marca, anio, precio);
        this.numPasajero = numPasajero;
    }

    public int getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }
    
    
}
