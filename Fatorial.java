import java.util.Scanner; // Precisa importar uma biblioteca para poder ler entrada de arquivos

public class Fatorial { // O nome do programa precisa ter o nome da class, ambos com LETRA MAIÚSCULA no começo
	public static int f_fatorial(int n){ // Definição de função ('public static' faz isso) // O int entre o nome da função e do public static é o que retorna (como a setinha em python) // Dentro do parênteses é parâmetro
		int f = 1; // Primeiro a gente escreve o tipo = valor, contrário do python. Ao definir uma variável, não é possível muda-la mais.

		for(int i=1 ; i <= n; i++ ){  // Onde começa; condição dele; o quanto ela vai aumentando (i++ = i = i+1), basicamente um range.
			f = f * i;
		} 
		return f;
	}

	public static void main(String[] args){ // Void = função não retorna nada // Sempre que fizer um programa principal, por o main (inicialmente), isso torna ele o programa principal. // (String[] args) é obrigatório
		Scanner teclado = new Scanner(System.in); // Criou uma variável teclado e disse que ela é o teclado do computador
		int num; // Cria variável num

		System.out.print("Digite o número inteiro positivo "); // print e input tem que vir separados
		num = teclado.nextInt(); // nextInt é basicamente um int(input())

		System.out.print("Fatorial de ");
		System.out.print(num);
		System.out.println(" igual a "); // Mesmo em linhas diferentes, esses 3 prints vão estar na mesma linha.
		System.out.println(f_fatorial(num)); // O ln serve para pular linha, então esse print não vai estar na mesma linha dos outros 3, ja que o de cima usou ln. O mesmo serve pro de baixo.

		System.out.print("SEJA BEM VINDO A PROGRAMAÇÃO JAVA! minecraft"); // O print não aceita mais de uma coisa nele, e so imprime texto // Tem que ter quem faz a ação, pra depois fazer a ação. System (meio que uma moradia, é o computador.) . out (quem vai dar print, o objeto) . print. Basicamente: o computador vai na parte onde vai ENVIAR (out) informações e pede pra ele dar print 

	}
}

// SEMPRE por ; no fim da linha de código!
// System e String realmente sempre tem que ter letra miúscula no começo para o programa saber o que é
// Sempre por inicial maiúscula nos programas Java
// Sempre que quiser processar um arquivo java: transformar o .java em .class (fazer uma copia em .class, que é como o computador entende), como? -> javac arquivo.java. 
// Isso cria um arquivo.class, e ai é so rodar java arquivo, que ja vai. Sempre que atualiza o código, tem que refazer isso.


// 1. TEMPLATE DE UM PROGRAMA JAVA (TODOS SÃO ASSIM):
// public class <- (tipo um def()) xxxxx {
//	public static void main (String[] args){
//  }
//}

// Tabulação não é obrigatória em Java, so ajuda a visualizar (o importante é as chaves)