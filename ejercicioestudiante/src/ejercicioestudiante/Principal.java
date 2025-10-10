
package ejercicioestudiante;

// Clase principal para ejecutar el programa
public class Principal {

    public static void main(String[] args) {
        
         // Creamos un objeto de la clase Estudiante
         Estudiante estudiante=new Estudiante();  // Se instancia un nuevo objeto llamado estudiante
         
         //asignamos valores validos al atributo nombres 
         estudiante.setNombres("leanny"); // Llamamos al método setter para establecer el nombre del estudiante

         // Asignamos valores válidos al atributo nota
         estudiante.setNota(5.0); // Llamamos al método setter para establecer la nota del estudiante
         
         // Mostramos la información del estudiante llamando a su método
         estudiante.mostrarinformacion();
         
         // mostramos el siguiente mensaje en la consola
         System.out.println("\nInformacion del estudiante");
         
         // Imprimimos el nombre y la nota del estudiante usando los métodos getter
         System.out.println(" nombre: " +estudiante.getNombres() + " nota: " +estudiante.getNota());
     }
}
