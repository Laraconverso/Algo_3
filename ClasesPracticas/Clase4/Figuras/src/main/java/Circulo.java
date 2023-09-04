public class Circulo implements Figura{
    private final int radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        return radio * radio * Math.PI;
    }
}
