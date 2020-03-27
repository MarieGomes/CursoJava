public class ex03{
	public static void main(String[] args){
		double s[][] = new double[2][2], diag[] = new double[2],soma=0;
		
		//preenche a matriz s
		for(int i=0; i<diag.length;i++){
			for(int j=0; j<diag.length;j++){	
				System.out.printf("Digite o elemento da linha %d e coluna %d: ", i+1, j+1);
				s[i][j] = Double.parseDouble(System.console().readLine());
		
			}
		}
		
		//mostra a matriz s
		for(int i=0;i<diag.length;i++)
			System.out.printf("%f   %f\n",s[i][0],s[i][1]);		

		//armazena os elementos da diagonal secundária no vetor diag
		for(int i=0;i<diag.length;i++){
			for(int j=1; j>=0;j--){
				if(j-i = diag.length){
					diag[i] = s[i][j];
					System.out.printf("diag = %f\n",diag[i]);
				}	
			}	
		}
		
		System.out.println("Os elementos da diagonal secundária são:");
		//mostra o vetor diag
		for(int i=0;i<diag.length;i++)
			System.out.printf("%f ",diag[i]);	

		//soma os elementos da diagonal secundária
		for(int i=0;i<diag.length;i++)
			soma = soma + diag[i];
		
		System.out.printf("\nA soma da diagonal secundára é: %f\n",soma);

	}


}
