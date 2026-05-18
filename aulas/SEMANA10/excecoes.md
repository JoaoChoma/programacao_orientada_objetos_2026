# O que é uma exceção?

Uma exceção é um evento que interrompe o fluxo normal do programa quando ocorre algum problema durante a execução.

Exemplos comuns:

* divisão por zero
* entrada inválida
* acesso a posição inexistente em vetor
* tentativa de criar objeto com dados inválidos

Em vez de o programa simplesmente falhar sem controle, Java permite tratar essas situações.

## try catch

```
try {
    // código que pode gerar erro
} catch (TipoDaExcecao e) {
    // tratamento do erro
}
```

```
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
    }
}
```


## Estrutura finally

O bloco finally contém código que será executado sempre, ocorra exceção ou não.

```
try {
    // código
} catch (TipoDaExcecao e) {
    // tratamento
} finally {
    // sempre executa
}
```

```
public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida no vetor.");
        } finally {
            System.out.println("Fim do bloco de tratamento.");
        }
    }
}
```

## throw — lançando exceções manualmente

throw é usado quando o próprio programador decide lançar uma exceção.

```
public class ExemploThrow {
    public static void main(String[] args) {
        int idade = -5;

        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }

        System.out.println("Idade válida.");
    }
}
```

## throws — declarando que um método pode lançar exceção

```
public class ExemploThrows {

    public static void verificarIdade(int idade) throws Exception {

        if (idade < 18) {

            throw new Exception("Idade insuficiente.");

        }

        System.out.println("Acesso permitido.");

    }

    public static void main(String[] args) {

        try {

            verificarIdade(16);

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }

}
```