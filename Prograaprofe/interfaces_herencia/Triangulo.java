package solid;

public class Triangulo
        extends Figura
        implements Areas, Notificador{
    private int base;
    private int altura;
    private int area;
    @Override
    public void calcularArea(){
        int area = (base*altura)/2;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio mensaje al SMS "+mensaje);
    }

    @Override
    public void quiereFinca() {
        System.out.println(" Cuido la finca ?");
    }

    public int obtenerArea(){
        return area;
    }
    public void cambiarColor(String color){
        this.color = "Es mas bonito "+color;
    }
}
