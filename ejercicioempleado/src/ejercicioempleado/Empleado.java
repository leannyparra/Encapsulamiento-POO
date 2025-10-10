
package ejercicioempleado;

//definimos la clase Producto
public class Empleado {
     
    //Atributos privados,  solo accesibles dentro de esta clase
    private String nombre; // Almacena el nombre del empleado
    private double salario;  // Almacena el salario actual del empleado

     // Método setter para establecer el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asignamos el valor recibido al atributo nombre
    }
    // Método getter para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }
    // Método setter para establecer el salario del empleado con validación
    public void setSalario(double salario) {
        // Se verifica que el salario no sea menor al salario mínimo (1450000)
        if(salario>=1450000){
        this.salario = salario; // Si cumple, se asigna el valor
    }else{
            //mostramos el siguiente mensaje en la consola si no se cumple con las condiciones
            System.out.println("el salario no puede ser menor a minimo (1300000)");
        } 
    }
    // Método getter para obtener el salario del empleado
    public double getSalario() {
        return salario;
    }
    // Método para aumentar el salario en un porcentaje dado
    public void aumentosalario(double porcentaje) {
         // Se verifica que el porcentaje sea mayor a 0
        if(porcentaje>0){
            double aumento= salario* porcentaje /100; // Calculamos el aumento 
            salario+=aumento;  // Suma el aumento al salario actual
            
            //muestro el siguiente mensaje en la consola
            System.out.println("El salario ha sido imcrementado en un " +porcentaje + " % nuevo salario: " +salario);
    }else{
            //muestro el siguiente mensaje en la consola
            System.out.println("el porcentaje tiene que ser mayor que 0");
        }
   }
}
