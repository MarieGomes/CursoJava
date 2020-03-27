public class somalinha{
	public static void main(String[] args){
		int s[][] = new int[3][3],soma[] = new int[3],multi[][] = new int[3][3];

		for(int i=0;i<soma.length;i++)     //inicia todas as posições do vetor soma com 0
			soma[i] = 0;

		for(int i=0;i<3;i++){              //completa a matriz com valores inteiros fornecidos pela usuária
			for(int j=0;j<3;j++){
				System.out.printf("Digite o número a ser armazenado na linha %d e coluna %d: ",i+1,j+1);
				s[i][j] = Integer.parseInt(System.console().readLine());
			}
		}

		for(int x=0;x<3;x++)	//matriz s
			System.out.printf("%d     %d     %d\n",s[x][0],s[x][1],s[x][2]);
		
		
		for(int i=0;i<3;i++){          //armazena no vetor a soma dos números de cada linha da matriz
			for(int j=0;j<3;j++)
				soma[i] = soma[i] + s[i][j];
			
		}
		
		for(int x=0;x<3;x++)	//vetor
			System.out.printf("Vetor soma na posição %d: %d\n",x+1,soma[x]);

		for(int i=0;i<3;i++){              //completa a matriz multi com o produto entre a soma dos números da linha correspondente ao elemento da matriz s
			for(int j=0;j<3;j++)
				multi[i][j] = s[i][j]*soma[i];
			
		}

		for(int x=0;x<3;x++)	//matriz multi
			System.out.printf("%d     %d     %d\n",multi[x][0],multi[x][1],multi[x][2]);


	}




}
