package br.com.ada.pooii.aula2.exercicio2;

public class Circulo implements Shape{
    @Override
    public double calcularArea() {
        final double PI = 3.1415;
        double raio = 15;
        return PI * raio * raio;
    }
}
