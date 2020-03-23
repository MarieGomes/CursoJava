public class ex5{	
	public static void main(String[] args){

		double preco[] = new double [10], valort[] = new double [10], valtt = 0, acresc;
		int qut[]= new int [10], obj, num =0, objmv = 1;	
		
		

		do{
			
			System.out.println("Digite o número do objeto (1 a 10): ");
			obj = Integer.parseInt(System.console().readLine());
			System.out.println("Digite o valor unitário do objeto: ");	
			preco[obj-1] = Double.parseDouble(System.console().readLine());
			System.out.println("Digite a quantidade vendida do objeto: ");
			qut[obj-1] = Integer.parseInt(System.console().readLine());
			valort[obj-1] = preco[obj-1]*qut[obj-1];
			valtt = valtt + valort[obj-1];
			
			

			System.out.print("Digite um número diferente de -1 para continuar, ou igual caso queira parar o registro de produtos: ");
			num = Integer.parseInt(System.console().readLine());
			

		} while( num != -1);
		
		for(int x=0;x<=9;x++){
			System.out.println(" ");
			System.out.printf("Para o objeto %d, temos as seguintes informações:\n",x+1);
			System.out.printf("Valor unitário: %f\n",preco[x]);
			System.out.printf("Quantidade Vendida: %d\n",qut[x]);
			System.out.printf("Valor total de vendas do objeto: %f\n",valort[x]);
			System.out.println(" ");
		}

		acresc = (5.0/100.0)* valtt;	
		System.out.printf("Valor total de vendas: %f\n", valtt);
		System.out.printf("O salário final do vendedor é: %f\n", 1100.0+acresc);

		for(int i=0;i<=9;i++){	
			if(qut[i] > qut[objmv])	
				objmv = i;		
		}
		
		System.out.printf("O objeto mais vendido foi o %d\n", objmv+1);
		System.out.printf("O valor do objeto mais vendido é %f\n", preco[objmv]);

		

	}
}
