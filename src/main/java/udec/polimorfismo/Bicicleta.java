package udec.polimorfismo;

/**
 *Clase que contiene los atributos y metodos propios de una bicicleta
 * @author Jonathan
 */
public class Bicicleta extends Vehiculo{
    /**
     * atributo que contiene el numero de engranajes de la bicicleta
     */
    private int numeroEngranajes;
    /**
     * constructor de la clase que inicializa las variables propias y heredadas
     * @param modelo modelo del vehiculo heredado
     * @param marca marca del vehiculo heredado
     * @param numeroEngranajes numero de engranajes de la bicicleta
     */
    public Bicicleta(String modelo, String marca, int numeroEngranajes) {
        super(modelo, marca);
        this.numeroEngranajes = numeroEngranajes;
    }//constructor
    /**
     * metodo que realiza la impresion propia de la clase bicicleta
     */
    public void imprimirBcicicleta(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Numero Engranajes: "+numeroEngranajes);
    }//impriirBcicicleta
    /**
     * metodo que muestra la impresion implementada de la interface
     */
    @Override
    public void imprimirInterface() {
        System.out.println("\nImpresion de la interface en Bicicleta");
    }//imprimirInterface
    /**
     * retorna el numero de engranajes de la bicicleta
     * @return numeroEngranajes
     */
    public int getNumeroEngranajes() {
        return numeroEngranajes;
    }//getNumeroEngranajes
    /**
     * modifica el numero de engranajes de la bicicleta
     * @param numeroEngranajes 
     */
    public void setNumeroEngranajes(int numeroEngranajes) {
        this.numeroEngranajes = numeroEngranajes;
    }//setNumeroEngranajes
    
}//Bicicleta
