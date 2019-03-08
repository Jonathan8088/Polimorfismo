/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *clase que contiene toda la logica del proyecto
 * @author Jonathan
 */
public class Logica {
    /**
     * array que contiene el listado de vehiculo
     */
    List<Vehiculo> vehiculo = new ArrayList();
    /**
     * constructor de la clase
     */
    public Logica() {
        Vehiculo patineta = new Patineta("2018", "pajarito", (float)21.5);
        Vehiculo bicicleta = new Bicicleta("2019", "Shimano", 9);
        Vehiculo carro = new Carro(350, "2019", "Ford", "Gasolina");
        Vehiculo jet = new Jet("2015", "AirForce", "Jet", 2);
        vehiculo.add(patineta);
        vehiculo.add(bicicleta);
        vehiculo.add(carro);
        vehiculo.add(jet);
    }//constructor
    /**
     * metodo que imprime los datos contenidos en el array de vehiculos
     */
    private void imprimirLista(){
        for (Vehiculo vehiculo1 : vehiculo) {
            vehiculo1.imprimir();
           
            
            
        }
    }
    
}//Logica
