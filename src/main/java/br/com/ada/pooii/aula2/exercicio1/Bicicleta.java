package br.com.ada.pooii.aula2.exercicio1;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Aumentando a velocidade em " + velocidade);
    }

    @Override
    public void frear() {
    }
}
