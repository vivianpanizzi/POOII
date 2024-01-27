## Resumo do conteúdo Aula 2

---

Exceptions:

- Checked Exceptions: São exceções que ocorrem a tempo de compilação
- Unchecked Exceptions: São exceções que ocorrem em tempo de execução

As exceções checadas nós tratamos e as não checadas a gente evita.

---

O Object é o pai de todas as classes, então onde cabe um object cabe qualquer classe

Generics - serve para deixar um objeto genérico

Podemos usar o genérics em classes e métodos

Operador Diamond veio com o java 7 para simplificar o uso do genérics quando crio o objeto.

    Ex:
    Caixa<String> box = new Caixa<String>("abc");
    Caixa<String> box = new Caixa<>("abc"); // diamond  

Os nomes de parâmetro de tipo mais comumente usados são:
- E - Element (usado extensivamente pelo Java Collections Framework)
- K - Key 
- N - Number 
- T - Type 
- V - Value 
- S,U,V etc. - 2°, 3º, 4º tipos

---

Para relembrar:

- Exceptions:
  - https://www.universidadejava.com.br/java/java-excecoes/

- Generics: 
  - https://www.linkedin.com/pulse/java-generics-jose-carlos-soares-filho/?originalSubdomain=pt

  - https://www.dio.me/articles/java-generics