import datosPrincipales.Votante;
import interaccion.Consola;
import util.Utilidades;

import java.util.Date;

public class Principal {
    public static void main(String data[]) {
        Consola laConsola = new Consola();
        String elnombre = laConsola.leerCadena("Digite nombre");
        String elapellido = laConsola.leerCadena("Digite apellido");
        long numeroIden = laConsola.leerNumero("Digite Número identificación");
        String laFecha = laConsola.leerCadena("Digite fecha nacimiento en formato dd/MM/yyyy");

        Votante elvotante= new Votante();

        elvotante.modificarNombre(elnombre);
        elvotante.modificarApellido(elapellido);
        Utilidades utili = new Utilidades();

        Date nuvFecha = utili.convertirStringDate(laFecha);
        elvotante.modificarFechaNac(nuvFecha);
        elvotante.modificarnumeroIdentificacion(numeroIden);

        int laEdad = elvotante.calcularEdad();

        laConsola.imprimir("  Nombre  \t| Apellido  \t|  Apto   \t|  Edad ");

        String msgApto = "Es apto";
        if (laEdad < 18)
            msgApto = "No es apto";
        laConsola.imprimir(elvotante.obtenerNombre()+"  \t| "+elvotante.obtenerApellido()+"  \t| "+msgApto+"  \t|  "+laEdad);


    }
}