public class jogodaforca{	

	static char[] sorteiaPalavra(){
		int sorteio = (int) (Math.random()*10) + 1;
		
		switch(sorteio){
			case 1: return new char[]{'U','V','A'};
			case 2: return new char[]{'B','A','N','A','N','A'};
			case 3: return new char[]{'A','B','C','A','X','I'};
			case 4: return new char[]{'M','A','N','G','A'};
			case 5: return new char[]{'M','A','R','A','C','U','J','A'};
			case 6: return new char[]{'L','A','R','A','N','J','A'};
			case 7: return new char[]{'M','O','R','A','N','G','O'};
			case 8: return new char[]{'L','I','M','A','O'};
			case 9: return new char[]{'A','C','E','R','O','L','A'};
			case 10: return new char[]{'C','A','Q','U','I'};

		}
		return new char[0];

	}
	
	static char[] montaTabuleiro(char[] palavra){
		char[] tabuleiro = new char[palavra.length];
		for(int x=0;x<tabuleiro.length;x++)
			tabuleiro[x] = '_';
		
		return tabuleiro;

	}

	static void mostraTabuleiro(char[] tabuleiro){
		for(int x=0;x<tabuleiro.length;x++){
			System.out.print(tabuleiro[x]);
			System.out.print(" ");

		}	
	
		System.out.println();	
	
	}

	static boolean acertou(char[] palavra, char letra){
		for(int x=0;x<palavra.length;x++){
			if(palavra[x] == letra)
				return true;

		}
		return false;

	}

	
	static void atualizaTabuleiro(char[] tabuleiro, char[] palavra, char letra){
		for(int x=0;x<palavra.length;x++){
			if(palavra[x]==letra)
				tabuleiro[x] = letra;			
		
		}
	
	}
	
	static void main(String[] args){
		char[] palavra = sorteiaPalavra(); //palavra a ser adivinhada
		char[] tabuleiro = montaTabuleiro(palavra); //armazena oq é mostrado ao jogador a cada rodada
		int erros = 0;
		
		//o método equals da classe Arrays retorna true se os vetores informados forem iguais e false caso ocorra o contrário
		//os vetores são iguais quando tiverem o mesmo tamanho e os mesmos valores nas mesmas posições (obvious)
		while(erros <= 7 && !Arrays.equals(tabuleiro,palavra)){
		
			mostraTabuleiro(tabuleiro); //mostra o vetor tabuleiro
			
			System.out.print("Informe uma letra: ");
			char letra = System.console().readLine().charAt(0);	
			//verifica se o usuário acertou uma letra da palavra
			if(acertou(palavra,letra))
				atualizaTabuleiro(tabuleiro,palavra,letra);
			else
				erros++;

		}
		
		//verifica se o jogador ganhou ou perdeu
		if(erros > 7)
			System.out.println("Você perdeu: (");
		else
			System.out.println("Você venceu :)");


	}


}
