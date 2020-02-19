public class ex7{
	public static void main(String[] args){
	
		int n1,n2,n3;
		
		System.out.println("Digite o primeiro número");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o segundo número");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o terceiro número");
		n3 = Integer.parseInt(System.console().readLine());

	

		if(n1>n2 && n1>n3)
			System.out.printf("O maior número é %d\n", n1);
		if(n2>n1 && n2>n3)
			System.out.printf("O maior número é %d\n", n2);
		if(n3>n1 && n3>n2)
			System.out.printf("O maior número é %d\n", n3);

	}
}
