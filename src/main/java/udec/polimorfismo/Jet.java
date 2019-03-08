package udec.polimorfismo;

/**
 *clase que contiene los atributos y metodos del jet
 * @author Jonathan
 */
public class Jet extends VehiculoMotorizado{
    /**
     * atributo que contiene el numero de motores del jet
     */
    private int numeroMotores;
    /**
     * constructor de la clase que inicializa las variables propias y heredadas
     * @param modelo modelo del vehiculo heredado de la clase vehiculo 
     * @param marca marca del vehiculo heredado de la clase vehiculo
     * @param tipoCombustible tipo de combustible heredado de la clase vehiculo motorizado
     * @param numeroMotores numero de motores del jet
     */
    public Jet(String modelo, String marca, String tipoCombustible, int numeroMotores) {
        super(modelo, marca, tipoCombustible);
        this.numeroMotores = numeroMotores;
    }//constructor
    /**
     * metodo de impresion implementado de la interface
     */
    @Override
    public void imprimirInterface() {
        System.out.println("\nImpresion de la interface en Jet");
    }//imprimirInterface
    /**
     * metodo que muestra la impresio propia de la clase jet
     */
    protected void imprimirJet(){
        System.out.println("Marca: "+marca+" Modelo: "+modelo+" Tipo de Combustible: "+tipoCombustible+" Numero de motores: "+numeroMotores);
    }//imprimirJet
    /**
     * retorna el numero de motores del jet
     * @return numeroMotores
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }//getNumeroMotores
    /**
     * modifica el numero de motores
     * @param numeroMotores 
     */
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }//setNumeroMotores
    
}//Jet
