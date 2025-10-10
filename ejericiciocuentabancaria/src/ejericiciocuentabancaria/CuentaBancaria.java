
package ejericiciocuentabancaria;

// Definicimos de la clase CuentaBancaria
public class CuentaBancaria {
        
    //Atributos Privados, que solo estan accesibles dentro de la clase
    private String numerocuenta;
    private double saldo;

   //Método setter para establecer el número de cuenta
    public void setNumerocueta(String numerocuenta) {
        this.numerocuenta = numerocuenta; //asignamos el valor recibido al atributo
    }
    
     // Método getter para obtener el número de cuenta
    public String getNumerocueta() {
        return numerocuenta;// Devuelve el valor del atributo numerocuenta
    }

    // Método setter para establecer el saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;// Asignamos el valor recibido al atributo saldo
    }
     // Método getter para obtener el saldo
    public double getSaldo() {
        return saldo; // Devuelve el valor del atributo saldo
    }
    // Método para depositar dinero en la cuenta
    public void depocitar(double monto){
         // Solo se deposita si el monto es mayor que 0
        if(monto>0){
            saldo+=monto; // Se suma el monto al saldo actual
        }
    }
    // Método para retirar dinero de la cuenta
    public void retirar(double monto){
         // Se valida que el monto sea mayor que 0 y que haya saldo suficiente
        if(monto>0 && monto<= saldo){
            saldo-=monto; // Se resta el monto al saldo actual
        }
    }
}
    

