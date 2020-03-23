public class ex01{
	public static void main(String[] args){
		String nome[] = new String[10];
		double preco[] = new double[10],modulo,aum;
		int cod[] = new int[10];
	
		for(int x=0;x<10;x++){
			System.out.print("Digite o nome do produto: ");
			nome[x] = System.console().readLine();
			System.out.print("Digite o preço do produto: ");
			preco[x]= Double.parseDouble(System.console().readLine());
			System.out.print("Digite o código do produto: ");
			cod[x]= Integer.parseInt(System.console().readLine());
			System.out.println("");
		}

		System.out.println("Produtos que sofrerão aumento:");
		for(int x=0;x<10;x++){
			modulo = cod[x]%2;
			if((modulo == 0) && (preco[x]>1000)){
				aum = preco[x] + 0.2*preco[x];
				System.out.printf("Produto: %s\nCódigo: %d\nPreço sem aumento: %f\nPreço com aumento: %f\n",nome[x],cod[x],preco[x],aum);		
			}else{

				if(modulo == 0){
					aum = preco[x] + 0.15*preco[x];
					System.out.printf("Produto: %s\nCódigo: %d\nPreço sem aumento: %f\nPreço com aumento: %f\n",nome[x],cod[x],preco[x],aum);
				}
				
				if(preco[x]>1000){
					aum = preco[x] + 0.1*preco[x];
					System.out.printf("Produto: %s\nCódigo: %d\nPreço sem aumento: %f\nPreço com aumento: %f\n",nome[x],cod[x],preco[x],aum);	
				}
			}


		}



	}

}
