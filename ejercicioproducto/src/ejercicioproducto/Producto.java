
package ejercicioproducto;

//definimos la clse Producto
public class Producto {
    
    // Atributos privados: solo pueden ser accedidos dentro de esta clase
    private String nombre; // Almacena el nombre del producto
    private double precio; // Almacena el precio del producto
    private int stock;  // Almacena la cantidad disponible del producto
    
     // Método setter para asignar un valor al atributo nombre
    public void setnombre(String nombre){
        this.nombre=nombre;// usamos el this para referirse al atributo de la clase
    }
    
    // Método getter para obtener el valor del atributo nombre
    public String getnombre(){
        return nombre; // Retorna el nombre del producto
    }
    
    // Método setter para establecer el precio del producto con validación
    public void setPrecio(double precio) {
        
       // Se verifica que el precio sea igual o mayor a 100
       if(precio >=100){
           this.precio = precio; // Si cumple, se asigna el valor
       } 
       else{
           //muestro el siguiente mensaje en consola si no cumple con las condiciones
           System.out.println(" Error el precio no puede ser menor a 100");
       }
    }
     // Método getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }
    // Método setter para establecer el stock del producto con validación
    public void setStock(int stock) {
        // Se verifica que el stock no sea negativo
        if(stock >=0){
          this.stock = stock;  // Si cumple, se asigna el valor
      }else{ 
          //muestro si siguiente mensaje en consola si no cumple con las condiones 
          System.out.println(" Error el stock no puede ser negativo");
      }
    }
    // Método getter para obtener el stock del producto
    public int getStock() {
        return stock;
    }
    // Método para vender cierta cantidad de producto
    public void vender(int cantidad){
         // Se verifica que la cantidad sea positiva y que haya suficiente stock
         if(cantidad > 0 && cantidad <= stock){
             stock -= cantidad;  // Se resta la cantidad vendida del stock actual
             
             //muestro el siguiente mesaje en la consola
             System.out.println("Se vendieron " +cantidad+  " unidades stock para vender " + stock);
         }
         else{
             //muestro el siguiente mensaje el la consola
             System.out.println("No hay suficientes stock para vender " + cantidad + " unidades");
         }
     }
     
}

