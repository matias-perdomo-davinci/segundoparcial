package figuraplana;

public class Circulo extends FiguraPlana{
    // ATRIBUTOS
    private double radio;

    //CONSTANTES

    //CONSTRUCTORES
    public Circulo(double radio){
        this.radio=radio;
    }

    //METODOS

    //Getters y Setters

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    //Metodos Abstractos
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    //Metodo toString
}
