
package ejercicioestudiante;

//definimos la clse Estudiante 
public class Estudiante {
    
     //Atributos privados, que solo estan accesibles dentro de esta clase 
    private String nombres;
    private double nota;
    
    //metodo de acceso setter, para inicializar o establecer
    public void setNombres(String nombres) {
        this.nombres = nombres; //asignamos el valor recibido al atributo
    }

    // Método getter para obtener el nombre
    public String getNombres() {
        return nombres; //asignamos el valor recibido al atributo
    }
    
    public void setNota(double nota) {
       if(nota>=0 && nota<=5){
            this.nota = nota;
       }else{
           
           // se muestra el siguiente mensaje si no cumple con las condiciones
           System.out.println("Error la nota debe estar entre 0 y 5");
       }
     
    }
    
    public double getNota() {
        return nota;
    }
    public void mostrarinformacion(){
        System.out.println("nombre: "+nombres + "\n nota: " +nota);
    }
}

    

