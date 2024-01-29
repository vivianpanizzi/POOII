## Resumo do conteúdo Aula 4

---

São filhas de Number: Byte, Integer, Short, Long, Float, Double 

Sempre que estiver trabalhando com generics preferir Listas a Arrays

Quando eu uso o arrays no generics eu não consigo dar um new

Os arrays verificam o tipo em tempo de execução, já a Lista verifica em tempo de compilação

---

Métodos Genéricos

Definimos o tipo entre o public e o retorno. ex:
        
        public static <T> void qualquerCoisa         ou
        public static <T> T qualquerCoisa

---

Wildcards

Usamos quando queremos usar um tipo desconhecido

Tem 2 tipos:
- Limitado
  - Mais alto (Upper Bounded Wildcards) - usamos o *? extends* Number, ou seja, recebe qualquer coisa que herde de 
    Number, seus filhos 
  - Mais baixo (Lower Bounded Wildcards) - usamos o *? super* Integer, que aceita o Integer e todos pra cima, ou 
    seja, aceitaria Integer, Number e Object
- Ilimitado (Unbounded Wildcards) - Usamos somente o ? 

---

Pra relembrar:

Wildcards:
https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html

