public class ex1{
	public static void main(String[] args){
	
		int n1,n2,sub;

		System.out.println("Digite o primeiro numero");	
		n1 = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o segundo numero");	
		n2 = Integer.parseInt(System.console().readLine());

		sub = n1 - n2;
		
		if(n1 == n2)
			System.out.println("A diferença entre o primeiro e o segundo números é 0");
		else
			System.out.printf("A diferença entre o primeiro e o segundo números é %d\n", sub);			




	}
}
