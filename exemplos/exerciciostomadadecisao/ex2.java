public class ex2{
	public static void main(String[] args){
	
		int numero;

		System.out.println("Digite o numero");	
		numero = Integer.parseInt(System.console().readLine());

		
		if(numero >=1 && numero <= 9)
			System.out.println("O valor está na faixa permitida");	
		
		else
			System.out.println("O valor está fora da faixa permitida");		


	}
}
