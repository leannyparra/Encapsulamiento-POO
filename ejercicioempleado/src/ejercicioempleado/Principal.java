
package ejercicioempleado;

// Clase principal para ejecutar el programa
public class Principal {

    public static void main(String[] args) {
        
      // Creamos un objeto de la clase Empleado llamado em1
      Empleado em1 = new Empleado(); // Se crea una nueva instancia (objeto) de la clase Empleado
     
      //Asignamos un valor al atributo nombre usando el método setter
      em1.setNombre("leanny");
      
      // Mostramos el nombre del empleado en la consola usando el método getter
      System.out.println("el nombre de el empleado es: " + em1.getNombre());
      
      // Asignamos un salario válido al empleado
      em1.setSalario(1500000); // Se establece el salario en 1.500.000
      
      //Intentamos asignar un salario inválido
      em1.setSalario(1200000);
      
      // Mostramos en consola el salario actual del empleado
      System.out.println("el salario del empleado es: " +em1.getSalario());
      
      // Aumentamos el salario en un 10% usando el método aumentosalario
     em1.aumentosalario(10);// Calcula el 10% de aumento y muestra el nuevo salario en consola
      
  }
    
}
