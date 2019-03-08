package udec.polimorfismo;

/**
 *clase padre que contiene atributos y metodos del vehiculo
 * @author Jonathan
 */
public class Vehiculo{
    /**
     * atributo que contiene el modelo del vehiculo
     */
    protected String modelo;
    /**
     * atributo que contiene la marca del vehiculo
     */
    protected String marca;
    /**
     * constructor de la clase que inicializa las variables
     * @param modelo  modelo del vehiculo
     * @param marca   marca del vehiculo
     */
    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }//constructor
    /**
     * metodo que se va a heredar
     */
    protected void imprimir(){
        System.out.println("Impresion clase Vehiculo");
    }
    /**
     * retorna el modelo del vehiculo
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }//getModelo
    /**
     * modifica el modelo del vehiculo
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }//setModelo
    /**
     * retorna la marca del vehiculo
     * @return marca
     */
    public String getMarca() {
        return marca;
    }//getMarca
    /**
     * modifica la marca del vehiculo
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }//setMarca
    
}//Vehiculo
