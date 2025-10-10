
package ejerciciolibro;

// Clase principal para ejecutar el programa
public class Principal {

    public static void main(String[] args) {
        
        //Creamos un objeto de la clase Producto llamado objeto1
        Libro objeto1 = new Libro();
        Libro objeto2 = new Libro();
        
        // Asignamos un valor a los atributos usando el método setter
        objeto1.setTitulo("cien años de soledad");
        //asignamos valores
        objeto1.setAutor("Gabriel Garcia Marquez");
        //asignamso valores
        objeto1.setPagina(417);
        //asignamos valores
        objeto2.setTitulo("aladino");
        //Asignamos valores
        objeto2.setAutor("Antonio");
        //asignamos valores
        objeto2.setPagina(6);
        
        //Muestro los mensajes en la consola
        System.out.println("Libro 1: ");
        System.out.println("El titulo de el libro es: " +objeto1.getTitulo() + "\n El autor es: " +objeto1.getAutor() +  " \n El numero de paginas es: " +objeto1.getPagina());
        System.out.println(" \nLibro 2: ");
        System.out.println("El titulo de el libro es: " +objeto2.getTitulo() + "\n El autor es: " +objeto2.getAutor()+ "\n El numero de paginas es: " + objeto2.getPagina());
    } 
}
