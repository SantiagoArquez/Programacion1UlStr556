package datosPrincipales;
import java.util.Date;

public class Votante {
    //encasulapmiento

    private String nombre;
    private String apellido;
    private Long numeroIdentificacion;
    private Date fechaNacimiento;

    //Metodo modificar
    public void modificarNombre(String nuevoNombre){
        return = nuevoNombre;
    }
    public void modificarApellido(String nuevoApellido){
        return = nuevoApellido;
    }
    public void modificarNumeroIdentificacion(Long nuevoNumeroIdentificacion){
        return = nuevoNumeroIdentificacion;
    }
    public void modificarFechaNacimiento(String nuevoFechaNacimiento){
        return = nuevoFechaNacimiento;
    }
    //metodo obtener
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerapellido(){
        return apellido;
    }
    public Long obtenernumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public Date obtenerfechaNacimiento(){
        return fechaNacimiento;
    }
    public Int calcularEdad(){
        return 18; 
    }
}
