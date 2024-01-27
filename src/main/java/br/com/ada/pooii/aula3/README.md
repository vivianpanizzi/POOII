## Resumo do conteúdo Aula 3

---

Casting - Converte um objeto de um tipo em outro tipo

Existem 2 tipos de casting:
- Casting implícito: o Java faz automático quando ele sabe que não há risco de perder valor 
- Casting explícito: Temos que fazer manualmente, declarando pra qual queremos converter


Record - É uma forma mais simplificada de construir classes com dados imutáveis, que não mudam o valor depois de 
serem construías.
- Não precisa colocar que é Final, ele já vem por padrão
- Não precisa colocar private, ele já é encapsulado
- Não é possível estender um Record em outra classe


Raw type - é quando criamos classe ou interface gererica, mas não colocamos o tipo do parametro 

    private final List <T> elementos = new ArrayList();

Bounded Genérics: Quando queremos restringir o tipo de parametro que vai ser passado.

---

Para relembrar:

- Casting:  
  - https://www.guj.com.br/t/casting-com-tipos-primitivos/51907
- Wrappers, Autoboxing e Unboxing
  - https://www.devmedia.com.br/conhecendo-as-classes-wrappers-autoboxing-e-auto-unboxing/7384
- Records
  - https://www.guiadojava.com.br/2021/04/java-records.html
- Bounded
  - https://docs.oracle.com/javase/tutorial/java/generics/bounded.html