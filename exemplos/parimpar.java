public class parimpar{
	public static void main(String[] argss){
	
		int numero,teste;

		System.out.print("Digite um numero: ");
		numero = Integer.parseInt(System.console().readLine());

		teste = numero % 2;
		
		if(teste == 0)
			System.out.printf("O numero %d é par\n", numero);
		
		else
			System.out.printf("O numero %d é ímpar\n", numero);

		
	}
}
