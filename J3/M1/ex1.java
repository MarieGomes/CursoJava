public class ex1{
	public static void main(String[] args){
	
		int idade, resotim,respes,maiorid,resru,idaded;
		double mediad,porcepes;
		char nota;
		
		resotim = 0;
		respes = 0;
		resru = 0;
		idaded = 0;
		maiorid = -1;

		for(int x=1;x <= 100; x++){
		
			System.out.print("Digite sua idade: ");
			idade = Integer.parseInt(System.console().readLine());
			System.out.print("Digite a nota: ");	
			nota = System.console().readLine().charAt(0);

			if(nota == 'A')
				resotim += 1;

			if(nota == 'D'){
				resru +=1;
				idaded = idaded + idade;
			}

			if(nota == 'E'){
				respes += 1;
		
				if(idade > maiorid)
					maiorid = idade;	
			}

		}
		
		mediad = idaded/resru;
		
		System.out.printf("A quantidade de pessoas que responderam Ótimo(A) é %d\n",resotim);
		System.out.printf("A média de idade das pessoas que responderam Ruim(D) é %f\n",mediad);
		System.out.printf("A porcentagem de votos da nota Péssimo(E) é %d%% \n",respes);
		System.out.printf("A maior idade entre quem votou em Péssimo(E) é %d \n",maiorid);
	
	
	

	



	}
}
