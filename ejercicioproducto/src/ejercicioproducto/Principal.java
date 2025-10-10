
package ejercicioproducto;

// Clase principal para ejecutar el programa
public class Principal {

    public static void main(String[] args) {
        
      //Creamos un objeto de la clase Producto llamado pro1
      Producto pro1 =  new Producto(); 
      
      // Asignamos un valor al atributo nombre usando el método setter
      pro1.setnombre("celular");
      
      // Mostramos en consola el nombre del producto usando el método getter
      System.out.println("el producto es: " + pro1.getnombre());
      
      // Asignamos un valor al atributo precio usando el método setter
      pro1.setPrecio(2500000);
      
      // Mostramos en consola el precio del producto usando el método getter
      System.out.println("el precio es: " + pro1.getPrecio());
      
      // Asignamos un valor al atributo 'stock' usando el método setter
      pro1.setStock(20);
      
      // Mostramos en consola el stock del producto usando el método getter
      System.out.println("el stock es: " + pro1.getStock());
      
      // Realizamos una venta del producto llamando al método vender
      pro1.vender(15);
      
  }
    
}
