package cuentas;

/**
 * Clase principal, simulador de operaciones sobre cuenta bancaria
 * Crea una cuenta de la clase CCuenta, muestra su saldo y realiza
 * alguna operación sobre ella, mostrando información por pantalla
 * 
 * @author Manuel Bazarra
 */
public class Main {

    /**
     * Método principal, contienen la logica principal del programa, instancia una cuenta
     * y opera sobre ella
     * 
     * @param args 
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0f); //Enviamos 0 mientras no se especifica que hacer con el parametro
    }

    
    /**
     * Método que llama a las operaciones de retirada e ingreso en cuenta
     * 
     * @param cuenta1 objeto sobre el que se quiere operar
     * @param cantidad cantidad para operar, de momento sin uso
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
