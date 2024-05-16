# Desafio Controle Fluxo

Exercitando todo o conteúdo apresentado no módulo de Controle de Fluxo.

O sistema recebe dois parâmetros via terminal do tipo inteiro e com estes dois números você obtém a quantidade de interações que é sendo realizada a impressão no console dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   

Abaixo temos um trecho de código

```java
public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parUm = scan();

		System.out.println("Digite o segundo parâmetro");
		int parDois = scan();
		
		try {
			contar(parUm, parDois);		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parUm, int parDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parDois - parUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```
