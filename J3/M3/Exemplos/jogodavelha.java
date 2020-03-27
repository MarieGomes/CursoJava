public class jogodavelha{
	public static void main(String[] args){

		char jogo[][] = new char[3][3],jogador= 'X',vencedor='A';
		int lin,col,jogadas=0;
	
   		
		do{
			System.out.printf("Vez do jogador %c: \n",jogador);		
			System.out.print("Digite a linha: ");
			lin = Integer.parseInt(System.console().readLine()); 
			System.out.print("Digite a coluna: ");
			col = Integer.parseInt(System.console().readLine()); 			
			
		
			

			if(lin >=1 && lin <=3 && col >=1 && col <=3){

				jogo[lin-1][col-1] = jogador;
				
				if(jogador == 'X')
					jogador = 'O';
				else
					jogador = 'X';
				
				jogadas++;

				if(jogadas == 9)
					vencedor = 'E';                  //empate
 				
				for(int x=0;x<3;x++){    //checa todas as linhas e colunas
					if(jogo[x][0] == jogo[x][1] && jogo[x][1] == jogo[x][2])
						vencedor = jogo[x][0];
					if(jogo[0][x] == jogo[1][x] && jogo[1][x] == jogo[2][x])
						vencedor = jogo[0][x];
				}
				
				if(jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2])  //checa diagonal da esq pra dir
					vencedor = jogo[0][0];
				if(jogo[0][2] == jogo[1][1] && jogo [1][1] == jogo[2][0])	//checa diagonal da dir pra esq
					vencedor = jogo[0][2];
	
				
				for(int x=0;x<3;x++)	//tabuleiro
					System.out.printf("%c     %c     %c\n",jogo[x][0],jogo[x][1],jogo[x][2]);
				
		
			}else
				System.out.println("Posição inválida!");

		}while(vencedor != 'X' && vencedor != 'O' && vencedor != 'E');
		
		if(vencedor == 'E')
			System.out.println("\nEmpate!\n");
		else
			System.out.printf("O vencedor é: %c\n", vencedor);
		
	}


}
