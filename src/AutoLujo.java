/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class AutoLujo extends Vehiculo{
    private int numPasajeros;

    public AutoLujo(int numPasajeros, String placa, int numSerie, String marca, int anio, double precio) {
        super(placa, numSerie, marca, anio, precio);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    
}
