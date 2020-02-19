public class ex6{
	public static void main(String[] args){
	
		int n1,n2,n3,n4;
		
		System.out.println("Digite o primeiro número");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o segundo número");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o terceiro número");
		n3 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o quarto número");
		n4 = Integer.parseInt(System.console().readLine());
	

	
		System.out.println("Os números que são divisíveis por 2 ou 3 são: ");
	
		if(n1%2 == 0 || n1%3 ==0)
			System.out.printf("%d\n",n1);
		if(n2%2 == 0 || n2%3 ==0)
			System.out.printf("%d\n",n2);
		if(n3%2 == 0 || n3%3 ==0)
			System.out.printf("%d\n",n3);
		if(n4%2 == 0 || n4%3 ==0)
			System.out.printf("%d\n",n4);

	}
}
