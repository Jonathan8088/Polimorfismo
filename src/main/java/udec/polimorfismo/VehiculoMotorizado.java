package udec.polimorfismo;

/**
 *clase que contiene los atributos y metodos de los vehiculos motorizados
 * @author Jonathan
 */
public abstract class VehiculoMotorizado extends Vehiculo{
    /**
     * atributo que contiene el tipo de combustible del vehiculo
     */
    protected String tipoCombustible;
    /**
     * constructor de la clase que inicializa las variables propias y heredadas
     * @param modelo modelo del vehiculo heredado
     * @param marca marca del vehiculo heredado
     * @param tipoCombustible tipo de combustible del vehiculo
     */
    public VehiculoMotorizado(String modelo, String marca, String tipoCombustible) {
        super(modelo, marca);
        this.tipoCombustible = tipoCombustible;
    }//constructor
    /**
     * metodo que hereda de la clase vehiculo
     */
    @Override
    protected void imprimir() {
        System.out.println("VEHICULO MOTORIZADO");
    }//imprimir
    /**
     * Metodo que muestra la impresion propia de la clase vehiculo motorizado
     */
    protected void imprimirVehiculo(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Tipo Combustible: "+tipoCombustible);
    }//imprimirVehiculo
    /**
     * retorna el tipo de combustible
     * @return tipoCombustible
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }//getTipoCombustible
    /**
     * modifica el tipo de combustible
     * @param tipoCombustible 
     */
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }//setTipoCombustible
    
}//VehiculoMotorizado
