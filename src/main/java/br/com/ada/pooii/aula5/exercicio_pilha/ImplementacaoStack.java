package br.com.ada.pooii.aula5.exercicio_pilha;

import java.util.ArrayList;
import java.util.List;

public class ImplementacaoStack<E> implements Stack<E> {


    private final List<E> listaInterna;

    public ImplementacaoStack() {
        this.listaInterna = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }

    @Override
    public E pop() {
        return listaInterna.remove(listaInterna.size()-1);
    }

    @Override
    public E peek() {
        return listaInterna.get(listaInterna.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.size() == 0;

        //'listInterna.size() == 0' can be replaced with 'listInterna.isEmpty()'
    }
}
