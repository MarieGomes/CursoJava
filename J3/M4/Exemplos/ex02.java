public class ex02{
	
	static double sinal(double num){
		
		if(num>0)
			return 0;
		else
			return 1;

	}
		
	public static void main(String[] args){
		double N;
	
		
		System.out.print("Digite o número: ");
		N = Double.parseDouble(System.console().readLine());

		if(sinal(N) == 0)
			System.out.printf("O número %f é positivo\n",N);	
		else
			System.out.printf("O número %f é negativo\n",N);

	}



}
