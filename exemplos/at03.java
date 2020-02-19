public class at03 {
	public static void main(String[] args){

		double n1,n2,n3,media;
		System.out.println("Digite sua primeira nota");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.println("Digite sua segunda nota");
		n2 = Double.parseDouble(System.console().readLine());
		System.out.println("Digite sua terceira nota");
		n3 = Double.parseDouble(System.console().readLine());
		media = (n1+n2+n3)/3.0;
		
		System.out.printf("Sua média é: %f\n",media);
	
	}
}
	
