package br.com.ada.pooii.aula2.exercicio1;

public class Carro implements VeiculoMotorizado {

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Aumentando a velocidade em " + velocidade);
    }

    @Override
    public void frear() {

    }
}
