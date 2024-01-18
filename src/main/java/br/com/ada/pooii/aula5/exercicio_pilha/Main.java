package br.com.ada.pooii.aula5.exercicio_pilha;

public class Main {
    public static void main(String[] args) {
        Stack<String> minhaStack = new ImplementacaoStack<>();

        minhaStack.push("Lucia");
        minhaStack.push("Maria");
        minhaStack.push("Erica");
        minhaStack.push("Paula");

        System.out.println("Exemplo POP");
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        System.out.println();
        System.out.println("Exemplo Peek");
        nome = minhaStack.peek();
        System.out.println(nome);

        nome = minhaStack.peek();
        System.out.println(nome);

        System.out.println();
        System.out.println("Exemplo isEmpty");
        boolean vazio = minhaStack.isEmpty();
        System.out.println(vazio);

    }

}
