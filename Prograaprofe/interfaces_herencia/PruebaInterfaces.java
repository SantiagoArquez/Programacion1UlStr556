package solid;

public class PruebaInterfaces {
    static void main() {
        Triangulo triangulo = new Triangulo();
        triangulo.color = "azul";
        System.out.println( triangulo.color);

        int dato = triangulo.obtenerArea();
        System.out.println("area "+dato);
        triangulo.enviarMensaje(" Area es 12");
        triangulo.calcularArea();
        triangulo.cambiarColor("Negro ");
    }
}
