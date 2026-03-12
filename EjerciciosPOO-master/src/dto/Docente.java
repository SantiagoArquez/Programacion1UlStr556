package dto;

/**
 * Author: Vinni
 */
public class Docente {
    private String nombre;
    private String apellido;
    
    public String ObtenerNombre(){
        return nombre;
    }
    public String ObtenerApellido(){
        return apellido;
    }
    public void GuardarNombre(String nombre) {
        this.nombre = nombre;
    }
    public void GuardarApellido(String apellido) {
        this.apellido = apellido;
    }
}



    

