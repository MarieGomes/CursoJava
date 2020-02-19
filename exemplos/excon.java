public class excon{	
	public static void main(String[] args){

		char conceito;
	
		System.out.print("Digite o conceito dx alunx: ");
		conceito = System.console().readLine().charAt(0);

		if (conceito != 'A' && conceito != 'B' && conceito != 'C')
			System.out.println("Conceito Inválido");
	
		if (conceito == 'A' || conceito == 'B')
			System.out.println("Alunx aprovadx!");
		if (conceito == 'C')
			System.out.println("Alunx reprovadx!");

	}
}
