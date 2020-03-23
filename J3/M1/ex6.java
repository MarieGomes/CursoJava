public class ex6{
	public static void main(String[] args){	
		
		double altura[] = new double[10],soma=0,media=0;
		int maiormed=0;
		
		for(int x=0; x<=9;x++){
			System.out.printf("Digite a altura da pessoa %d\n",x+1);
			altura[x] = Double.parseDouble(System.console().readLine());
			soma = soma + altura[x];
		}
		
		media = soma/10.0;
		
		for(int x=0; x<=9; x++){	
			
			if( altura[x] > media)
				maiormed += 1;


		}
		
		System.out.printf("A média das alturas é %f\n",media);
		System.out.printf("A quantidade de pessoas com a altura maior que a média é %d\n",maiormed);
		
	
		






	}

}
