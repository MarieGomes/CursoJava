public class at04 {
	public static void main(String[] args){

		double preco,desconto,npreco;
		System.out.println("Digite o preço do produto");
		preco = Double.parseDouble(System.console().readLine());
		desconto = preco*10/100.0;
		npreco = preco - desconto;

		System.out.printf("O preço do produto com 10%% de desconto é : %f\n",npreco);
	
	}
}
	
