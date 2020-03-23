public class ex05{
	public static void main(String[] args){
		int num[] = new int[20],maiornum=0;
		double div[] = new double[20];

		System.out.println("Informe abaixo os valores das posições do vetor:");
		for(int x=0; x<20; x++){
			System.out.printf("%dª Posição: ",x+1);
			num[x] = Integer.parseInt(System.console().readLine());

		}

		for(int x=0; x<20; x++){
			if(num[x]>maiornum)
				maiornum = num[x];
		}

		System.out.printf("Abaixo estão os valores do vetor divididos por %d, que é o maior número fornecido:\n",maiornum);
		for(int x=0; x<20; x++){
			div[x] = num[x]/(double)maiornum;
			System.out.printf("%dª Posição: %d / %d = %f\n",x+1,num[x],maiornum,div[x]);
			
		}
		
	

	}


}
