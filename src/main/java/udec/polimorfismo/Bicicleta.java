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
     * metodo heredado de la clase vehiculo
     */
    @Override
    protected void imprimir() {
        System.out.println("Bicicleta");
    }//imprimir
    /**
     * metodo que realiza la impresion propia de la clase bicicleta
     */
    private void impriirBcicicleta(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Numero Engranajes: "+numeroEngranajes);
    }//impriirBcicicleta
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
