package cuentas;


/**
 * Clase CCuenta, representa una cuenta bancaria y aloja los datos relativos a ella,
 * como el titular, numero de cuenta, saldo e intereses
 * 
 * @author bofh
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa todas las propiedades de la cuenta
     * @param nom nombre completo del titular
     * @param cue numero de cuenta
     * @param sal saldo inicial 
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el saldo actual de la cuenta
     * @return saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresar una cantidad de dinero en cuenta
     * 
     * @param cantidad dinero a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retirar dinero de la cuenta, comprueba si hay suficiente dinero en cuenta
     * antes de retirar el dinero, de no haberlo devuelve una excepcion
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    //Getters y setters generados automáticamente
    
     /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
