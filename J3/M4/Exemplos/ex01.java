public class ex01{

	static double quad(double num){
			double resultado;
			resultado = num*num;
			return resultado;

	}
	
	public static void main(String[] args){
		double N;
		
		System.out.print("Escreve o número a ser elevado ao quadrado: ");
		N = Double.parseDouble(System.console().readLine());

		System.out.printf("O quadrado de %f é %f\n", N, quad(N));
	
	}



}
