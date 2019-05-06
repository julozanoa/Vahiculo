/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Camioneta extends Vehiculo{
    private int capacidadCarga;
    private int cantidadEjes;
    private int numRodadas;

    public Camioneta(int capacidadCarga, int cantidadEjes, int numRodadas, String placa, int numSerie, String marca, int anio, double precio) {
        super(placa, numSerie, marca, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
        this.numRodadas = numRodadas;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getNumRodadas() {
        return numRodadas;
    }

    public void setNumRodadas(int numRodadas) {
        this.numRodadas = numRodadas;
    }
    
    
}
