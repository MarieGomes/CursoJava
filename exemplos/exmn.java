public class exmn{
	public static void main(String[] args){	
	
		int n1, n2;
		System.out.print("Digite o primeiro numero: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo numero: ");
		n2 = Integer.parseInt(System.console().readLine());

		if (n1 == n2){
			System.out.println("Os numeros digitados são iguais");}
		else {
			if (n1>n2)
			System.out.printf("O primeiro numero %d é o maior numero\n",n1);
			else	
			System.out.printf("O segundo numero %d é o maior numero\n", n2);}
	



	}
}
