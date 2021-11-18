package figuraplana;

public class Cuadrado extends FiguraPlana{
    // ATRIBUTOS
    private double lado;


    //CONSTANTES

    //CONSTRUCTORES
    public Cuadrado(double lado){
        this.lado=lado;
    }

    //METODOS

    //Getters y Setters

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    //Metodos Abstractos
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
    //Metodo toString
}
