package br.com.ada.pooii.aula2.exercicio2;

public class Triangulo implements Shape {
    @Override
    public double calcularArea() {
        double base = 20;
        double altura = 30;
        return (base * altura)/2;
    }
}
