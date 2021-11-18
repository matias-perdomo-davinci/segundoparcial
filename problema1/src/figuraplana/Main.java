package figuraplana;

public class Main {
    public static void main(String[] args) {
        Rectangulo primerRectangulo = new Rectangulo(1,5);
        //primerRectangulo.setAltura(9);
        //System.out.println(primerRectangulo.getAltura());
        System.out.println(primerRectangulo.calcularArea());
        System.out.println(primerRectangulo.calcularPerimetro());

        Circulo primerCirculo = new Circulo(4);
        System.out.println(primerCirculo.calcularArea());
        System.out.println(primerCirculo.calcularPerimetro());

        Cuadrado primerCuadrado = new Cuadrado(4);
        System.out.println(primerCuadrado.calcularArea());
        System.out.println(primerCuadrado.calcularPerimetro());
    }
}
