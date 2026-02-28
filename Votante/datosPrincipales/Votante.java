package datosPrincipales;

import java.util.Calendar;
import java.util.Date;

public class Votante {
    // ENCAPSULAMIENTO
    //PROTECCION DE INFORMACION
    //CON ACCESO CONTROLADO

    private long numeroIdentificacion;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    //metodo modificar


    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void modificarApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }
    public void modificarnumeroIdentificacion(long nuevaIdentificacion){
        numeroIdentificacion = nuevaIdentificacion;
    }
    public void modificarFechaNac(Date nuevaFecha){
        fechaNacimiento = nuevaFecha;
    }

    //metodo obtener
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public long obtenerNumeroIdentif(){
        return numeroIdentificacion;
    }
    public Date obtenerFechaNac(){
        return fechaNacimiento;
    }
    public int calcularEdad(){
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
        edad--;
        }
        return edad;
}
}