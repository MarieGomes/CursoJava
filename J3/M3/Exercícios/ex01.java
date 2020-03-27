public class ex01{
	public static void main(String[] args){
		int s[][] = new int[6][4], maior[]= new int[6], multi[][] = new int[6][4];

		for(int i=0;i<6;i++){        //preenche a matriz s
			for(int j=0;j<4;j++){
				System.out.printf("Digite o elemento da linha %d e coluna %d: ",i+1,j+1);
				s[i][j] = Integer.parseInt(System.console().readLine());
		
			}
		}

		System.out.printf("\n");		
		for(int i=0;i<6;i++)          //matriz s
			System.out.printf("%d   %d   %d   %d\n",s[i][0],s[i][1],s[i][2],s[i][3]);
		
		for(int i=0; i<maior.length; i++) //zero todos os elementos do vetor maior
			maior[i] = 0;

		for(int i=0;i<6;i++){        //preenche o vetor com o maior elemento da linha correspondente
			for(int j=0;j<4;j++){
				if(s[i][j]>maior[i])
					maior[i] = s[i][j];
			}
		}

		for(int i=0; i<maior.length; i++) //mostra vetor maior
			System.out.printf("Na linha %d o maior elemento é %d\n",i+1,maior[i]);		
		
		for(int i=0;i<6;i++){        //preenche a matriz multi
			for(int j=0;j<4;j++){
				multi[i][j] = s[i][j]*maior[i];
		
			}
		}
		System.out.printf("\n");
		System.out.println("A matriz de multiplicação pelos maiores elementos da linha correspondente é: ");	
		for(int i=0;i<6;i++)         //matriz multi
			System.out.printf("%d   %d   %d   %d\n",multi[i][0],multi[i][1],multi[i][2],multi[i][3]);	
				
		
	}




}
