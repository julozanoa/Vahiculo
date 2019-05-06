/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        Camioneta camioneta = new Camioneta(10, 2, 5, "XCR254", 123, "Toyota", 2019, 150000000);
        
        Vagoneta vagoneta = new Vagoneta(10, "RBO497", 456, "Dodge", 2015, 80000000);
        
        empresa.registrarVehiculo(camioneta);
        empresa.registrarVehiculo(vagoneta);
        
        HashMap<String,Vehiculo> vehiculo1 = empresa.listarVehiculos();
        
        for (Vehiculo vehiculo : vehiculo1.values()) {
            System.out.println(vehiculo.getNumSerie());
            System.out.println(vehiculo.getPlaca());
            System.out.println(vehiculo.getMarca());
        }
        
    }
}
