public class ex4{
	public static void main(String[] args){
	
		int a,b,c,s1,s2,s3;

		System.out.println("Digite o valor do lado a:");	
		a = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o valor do lado b:");	
		b = Integer.parseInt(System.console().readLine());
		System.out.println("Digite o valor do lado c:");	
		c = Integer.parseInt(System.console().readLine());
		
		s1 = a + b;
		s2 = b + c;
		s3 = a + c;

		if(s1 > c && s2 > a && s3 > b)
			System.out.println("Os lados formam um triângulo");
		else
			System.out.println("Os valores informados não podem formar um triângulo");	

	}
}
