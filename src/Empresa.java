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
public class Empresa {
    
    private HashMap<String, Vehiculo> vehiculo;
    
    public Empresa(){
        this.vehiculo = new HashMap<>();
    }
    
    public void registrarVehiculo( Vehiculo vehiculo){
        this.vehiculo.put(vehiculo.getPlaca(), vehiculo);
    }
    
    public HashMap listarVehiculos(){
        return this.vehiculo;
    }
}
