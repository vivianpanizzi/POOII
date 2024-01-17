package br.com.ada.pooii.aula3.exercicio;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T, U> {

  private final List<T> elementos = new ArrayList<>();

  public void adicionar (T elemento){
      this.elementos.add(elemento);
  }

  public T obter(int indice) {
      return this.elementos.get(indice);
  }


  public boolean contem(T elemento){
      return this.elementos.contains(elemento);
  }

}
