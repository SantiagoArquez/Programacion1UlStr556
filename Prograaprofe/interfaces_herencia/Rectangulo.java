package solid;

public class Rectangulo implements Areas{
    private int lado;
    private int area;
    @Override
    public void calcularArea() {
        this.area = lado*lado;
    }

    public int obtenerArea(){
        return area;
    }
}
