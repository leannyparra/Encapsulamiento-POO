
package ejericiciocuentabancaria;

// Clase principal para ejecutar el programa
public class Principal {

    public static void main(String[] args) {
        
        // Se crean dos objetos de tipo CuentaBancaria
        CuentaBancaria cuenta1= new CuentaBancaria();
        CuentaBancaria cuenta2= new CuentaBancaria();
        
        // Se establecen los valores iniciales de cada cuenta usando los setters
        cuenta1.setNumerocueta("291120");
        cuenta1.setSaldo(50000);
        cuenta2.setNumerocueta("300420");
        cuenta2.setSaldo(200000);
        
         // Se realizan operaciones de depósito y retiro en cuenta1
        cuenta1.depocitar(300000);
        cuenta1.retirar(1000);
        
         // Se realizan operaciones de depósito y retiro en cuenta2
        cuenta2.depocitar(20000); // Deposita 20000
        cuenta2.retirar(1000); // Retira 1000
        
        // Se muestran los resultados finales en consola
        System.out.println("\nsaldo final ");
         System.out.println("cuenta numero 1: " +cuenta1.getNumerocueta() + " saldo final de: " +cuenta1.getSaldo());
        System.out.println("centa numro 2 : " +cuenta2.getNumerocueta() + " saldo final de: " +cuenta2.getSaldo());
        
     }
            
}

