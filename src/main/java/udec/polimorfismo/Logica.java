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
        datos();
        imprimirLista();
    }//constructor
    /**
     * metodo que deja vehiculos quemados por defecto
     */
    private void datos(){
        Vehiculo patineta = new Patineta("2018", "pajarito", (float)21.5);
        Vehiculo bicicleta = new Bicicleta("2019", "Shimano", 9);
        Vehiculo carro = new Carro(350, "2019", "Ford", "Gasolina");
        Vehiculo jet = new Jet("2015", "AirForce", "Jet", 2);
        vehiculo.add(patineta);
        vehiculo.add(bicicleta);
        vehiculo.add(carro);
        vehiculo.add(jet);
    }//datos
    /**
     * metodo que imprime los datos contenidos en el array de vehiculos
     */
    private void imprimirLista(){
        for (Vehiculo vehiculo1 : vehiculo) {
            if(vehiculo1 instanceof Patineta){
                ((Patineta)vehiculo1).imprimirInterface();
                ((Patineta)vehiculo1).imprimir();
                ((Patineta)vehiculo1).imprimirPatineta();
            }else if(vehiculo1 instanceof Bicicleta){
                ((Bicicleta)vehiculo1).imprimirInterface();
                ((Bicicleta)vehiculo1).imprimir();
                ((Bicicleta)vehiculo1).imprimirBcicicleta();
            }else if(vehiculo1 instanceof Carro){
                ((Carro)vehiculo1).imprimirInterface();
                ((Carro)vehiculo1).imprimir();
                ((Carro)vehiculo1).imprimirVehiculo();
                ((Carro)vehiculo1).imprimirCarro();
            }else if(vehiculo1 instanceof Jet){
                ((Jet)vehiculo1).imprimirInterface();
                ((Jet)vehiculo1).imprimir();
                ((Jet)vehiculo1).imprimirVehiculo();
                ((Jet)vehiculo1).imprimirJet();
            }//if
        }//for
    }//imprimirLista
    
}//Logica
