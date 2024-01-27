package br.com.ada.pooii.aula2.exercicio2;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();

        System.out.println("A área do circulo é: " + areaCirculo);
        System.out.println("A área do retangulo é: " + areaRetangulo);
        System.out.println("A área do triangulo é: " + areaTriangulo);

    }

}
