package udec.polimorfismo;

/**
 *clase que contiene lo atributos y metodos de un carro
 * @author Jonathan
 */
public class Carro extends VehiculoMotorizado{
    /**
     * atributo que contiene el cilindraje del motor del carro
     */
    private int cilindraje;
    /**
     * constructor de la clase que inicializa los atrbutos propios y heredados
     * @param cilindraje clinindraje del motor del carro
     * @param modelo modelo del vehiculo heredado de clase vehiculo
     * @param marca maraca del vehiculo heredado de clase vehiculo
     * @param tipoCombustible tipo de combustible heredado de la clase vehiculoMotorizado
     */
    public Carro(int cilindraje, String modelo, String marca, String tipoCombustible) {
        super(modelo, marca, tipoCombustible);
        this.cilindraje = cilindraje;
    }//constructor
    /**
     * metodo que especializa la impresion que hereda de la clase vehiculo
     */
    @Override
    protected void imprimir() {
        System.out.println("CARRO");
    }//imprimir
    /**
     * metodo que especializa la impresion heredada de la clase vehiculo motorizado
     */
    @Override
    protected void imprimirVehiculo() {
        System.out.println("Tipo de vehiculo motorizado");
    }//imprimirVehiculo
    /**
     * metodo que muestra la impresion propia de la clase carro
     */
    private void imprimirCarro(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Tipo Combustible: ");
    }//imprimirCarro
    /**
     * retorna el cilindraje del motor de carro
     * @return cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }//getCilindraje
    /**
     * modifica el cilindraje del motor del carro
     * @param cilindraje 
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }//setCilindraje
    
}//Carro
