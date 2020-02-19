public class ex02{
	public static void main(String[] args){
		double num,quad;
		
		num = Double.parseDouble(System.console().readLine());
		quad = num*num;
		
		System.out.printf("O numero que voce digitou é %f\n E o quadrado desse numero é %f\n",num,quad);
	}
}
