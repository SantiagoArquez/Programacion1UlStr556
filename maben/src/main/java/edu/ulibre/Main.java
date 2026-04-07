package edu.ulibre;
import edu.ulibre.datos.Equipo;

public class Main {
    public static void main(String[] args) {
        //Equipo equipo = new Equipo(); //si uso setter
        //equipo.setNombre("dsadasdasd");
        //
        Equipo equipo = Equipo
        .builder()//aca es inmutable osea solo se puede modificar una vez
        .nombre("Elsa")
        .identificacion(10325132L)
        .build();

        System.out.println(equipo.getNombre());
    }
}