package br.com.ada.pooii.aula2.exercicio2;

public class Retangulo implements Shape{
    @Override
    public double calcularArea() {
        double base = 25;
        double altura = 30;
        return base * altura;
    }
}
