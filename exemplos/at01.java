public class at01 {
	public static void main(String[] args){

		double n1,n2,sub;
		System.out.println("Digite o primeiro numero");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.println("Digite o segundo numero");
		n2 = Double.parseDouble(System.console().readLine());
		sub = n1 - n2;
		
		System.out.printf("A subtração do primeiro número pelo segundo é: %f\n",sub);
	
	}
}
	
