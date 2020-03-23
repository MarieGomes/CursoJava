public class ex03{
	public static void main(String[] args){
		String nome[] = new String[9];
		int qtd[] = new int[9];
		double div;
	

		for(int x=0; x<2;x++){
			System.out.print("Digite o nome do cliente: ");
			nome[x] = System.console().readLine();
			System.out.print("Digite a quantidade de DVD's que esse cliente locou em 2017: ");
			qtd[x] = Integer.parseInt(System.console().readLine());
		}
		

		for(int x=0; x<2;x++){
			div = qtd[x]/10.0;	

			if(qtd[x] >= 10){
				System.out.printf("O cliente %s tem direito a %d locações gratuitas\n", nome[x], (int)div);
			}else{
				System.out.printf("O cliente %s não tem direito a locações gratuitas\n",nome[x]);
			}
			
		}		


	}


}
