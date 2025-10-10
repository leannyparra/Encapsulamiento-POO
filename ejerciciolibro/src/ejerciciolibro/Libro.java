
package ejerciciolibro;

public class Libro {
    
    // Atributos privados: solo se pueden acceder dentro de esta clase
    private String titulo;  // Almacena el título del libro
    private String autor; // Almacena el nombre del autor del libro
    private int pagina; // Almacena la cantidad de páginas del libro

    //metodo de acceso setter, para inicializar o establecer
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Asignamos el valor recibido al atributo 'titulo
    }
     // Método getter para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }
    // Método setter para establecer el autor del libro
    public void setAutor(String autor) {
        this.autor = autor; // Asignamos el valor recibido al atributo autor
    }
    // Método getter para obtener el autor del libro
    public String getAutor() {
        return autor;
    }
    // Método setter para establecer la cantidad de páginas del libro con validación
    public void setPagina(int pagina) {
        // Se verifica que el número de páginas sea mayor a 10
        if(pagina>10){
          this.pagina = pagina;   // Si cumple la condición, se asigna el valor
         }else{
            //muestro el siguiente mensaje si no se cumple con la condicion 
            System.out.println("El numero de paguinas debe ser mayor a 10");
        }
    }
    // Método getter para obtener la cantidad de páginas del libro
    public int getPagina() {
        return pagina;
    }  
}
    
