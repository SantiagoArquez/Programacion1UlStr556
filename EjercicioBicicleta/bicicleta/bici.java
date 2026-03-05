package bicicleta,
import vehiculo.vehiculo,
public class bici {
    private int numero
    private String color,

    // constructor
    public bici(int numero, String color, String marca) {
        this.numero = numero,
        this.color = color,
        super("bicicleta", marca),
    }

    public int getNumero(){
        return numero,
    }

    public String getColor(){
        return color,
    }

    public void mostrar(){
        System.out.println("La marca es: " + getMarca()),
        System.out.println("Tipo:"+getTipo()+"y el color:" + getColor()),
        System.out.print("Pasos o marchas andadas: "+getNumero()),
    }
}