public class ex02{
	public static void main(String[] args){
		int s[][] = new int[10][10],diag[] = new int[10];
		double media,soma=0;

		//preenche a matriz s
		for(int i=0;i<diag.length;i++){
			for(int j=0;j<diag.length;j++){
				System.out.printf("Digite o elemento da linha %d e coluna %d: ",i+1,j+1);
				s[i][j] = Integer.parseInt(System.console().readLine());
			}
		}
		
		//armazena os elementos da diagonal principal no vetor diag
		for(int i=0;i<diag.length;i++){
			for(int j=0;j<diag.length;j++){
				if(i==j)
					diag[i] = s[i][j];
			}
		}

		//matriz s
		for(int i=0; i<diag.length; i++)
			System.out.printf("%d  %d\n", s[i][0],s[i][1]);

		//soma os elementos da diagonal principal
		for(int i=0;i<diag.length;i++)
			soma = soma + diag[i];
		//média dos elementos da diagonal principal
		media = soma/(double)diag.length;
		System.out.printf("A média dos elementos da diagonal principal é: %f\n", media);
		
	}
}
