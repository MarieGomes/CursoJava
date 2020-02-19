public class ex3{
	public static void main(String[] args){
	
		int a,b,c,delta;

		System.out.println("Digite o valor de a:");	
		a = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o valor de b:");	
		b = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o valor de c:");	
		c = Integer.parseInt(System.console().readLine());

		delta = (b*b) - (4*a*c);
		
		if(delta>0)
			System.out.println("A equação possui duas raízes reais");

		if(delta<0)
			System.out.println("A equação não possui raízes reais");

		if(delta==0)
			System.out.println("A equação possui uma única raiz real");
		
			
	}
}
