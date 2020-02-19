public class at02 {
	public static void main(String[] args){

		double n1,n2,sub;
		System.out.println("Digite o primeiro numero");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.println("Digite o segundo numero, que deve ser diferente de zero");
		n2 = Double.parseDouble(System.console().readLine());
		sub = n1/n2;
		
		System.out.printf("A divisão do primeiro número pelo segundo é: %f\n",sub);
	
	}
}
	
