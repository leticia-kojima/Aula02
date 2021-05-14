import java.util.Scanner;

public class DesvioEncadeado {

	public static void main(String[] args) {
		/*Uma ONG resolveu prestar um serviço bem diferente: ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomoção para poderem votar.
		 * Para evitar problemas no momento do embarque, porém, você foi convidado a criar um programa que valide a idade dos passageiros: caso tenham 16 anos ou menos, não podem votar (e nem embarcar). Caso tenham entre 16 anos e 18 incompletos, podem optar por votar ou não. Caso tenham mais de 18 anos, devem votar obrigatoriamente.
		 * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar.*/
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a idade do passageiro.");
		idade = leitor.nextInt();
	
		/*Aqui devemos criar uma solução para realizar as verificações.*/
		
		if (idade < 16) {
			//Aqui o que ocorre se a idade for menor do que 16
			System.out.println("Você não pode votar e nem embarcar");
		}else {
			//Aqui é a parte FALSE do primeiro if
			if (idade > 18) {
				//Aqui temos a parte verdadeira do segundo if, portanto o que ocorre se tiver MAIS que 18 anos
				System.out.println("Você é obrigado a votar");
			}else {
				//Aqui temos a parte falsa do segundo if, portanto, se o usuário NÃO TIVER menos de 16 anos, NÃO tiver mais que 18 anos
				System.out.println("Você pode optar por votar e embarcar");
			}
		}
		
		
	
		leitor.close();

	}

}
