public class ex02{
	public static void main(String[] args){
		double num[] = new double[5],soma=0;
		
		for(int x=0; x<5; x++){
			System.out.printf("Digite o %dº número: ",x+1);
			num[x] = Double.parseDouble(System.console().readLine());
			soma = soma + num[x];

		}
		
		System.out.printf("Os números digitados foram: \n %f + %f + %f + %f + %f = %f\n",num[0],num[1],num[2],num[3],num[4],soma);



	}


}
