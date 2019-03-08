package udec.polimorfismo;

/**
 *clase que contiene los atributos y clases propios de una patineta
 * @author Jonathan
 */
public class Patineta extends Vehiculo{
    /**
     * atributo que contiene el tamaño de la tabla
     */
    private float tamanoTabla;
    /**
     * constructor de la clase que inicializa los atributos propios y heredados
     * @param modelo
     * @param marca 
     * @param tamañoTabla 
     */
    public Patineta(String modelo, String marca,float tamanoTabla) {
        super(modelo, marca);
        this.tamanoTabla = tamanoTabla;
    }//constructor
    /**
     * metodo heredado de la clase vehiculo
     */
    @Override
    protected void imprimir() {
        System.out.println("PATINETA");
    }//imprimir
    /**
     * Metodo que muestra la impresion propia de la clase patineta
     */
    private void imprimirPatineta(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Tamaño Tabla: "+tamanoTabla);
    }//imprimirPatineta
    /**
     * retorna el tamaño de la tabla
     * @return tamanoTabla
     */
    public float getTamanoTabla() {
        return tamanoTabla;
    }//getTamanoTabla
    /**
     * modifica el tamaño de la tabla
     * @param tamanoTabla 
     */
    public void setTamanoTabla(float tamanoTabla) {
        this.tamanoTabla = tamanoTabla;
    }//setTamanoTabla
    
}//Patineta
