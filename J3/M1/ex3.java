public class ex3{
	public static void main(String[] args){
		
		double salario,imposto,aumento;
		int op;
	
	
		
		
		do{

			System.out.println("\nEscolha umas das opções a seguir, digitando o número correspondente da opção:");
			System.out.println("1. Imposto");
			System.out.println("2. Novo Salário");
			System.out.println("3. Classificação");
			System.out.println("4. Finalizar o programa");
			op = Integer.parseInt(System.console().readLine());
	
			switch(op){
				
				case 1:
					System.out.print("Digite seu salário: ");			
					salario = Double.parseDouble(System.console().readLine());
					
					if(salario < 1000)
						imposto = (salario*5)/100;
					else if(salario >= 1000 && salario <= 3000)
						imposto = (salario*10)/100;
					else
						imposto = (salario*15)/100;

					System.out.printf("O valor do imposto é de %f\n",imposto);	

					break;

				case 2:
					System.out.print("Digite seu salário: ");			
					salario = Double.parseDouble(System.console().readLine());
					
					if(salario > 4500)
						salario = salario + 45;
					else if(salario >= 2250 && salario <= 4500)
						salario = salario + 150;
					else if(salario >= 1350 && salario < 2250)
						salario = salario + 225;
					else
						salario = salario + 300;
					
					System.out.printf("O novo valor do seu salário é de %f\n",salario);	
					
					break;

				case 3:
					System.out.print("Digite seu salário: ");			
					salario = Double.parseDouble(System.console().readLine());
					
					if(salario > 1500)
						System.out.println("Bem remunerado");
					else
						System.out.println("Mal remunerado");
					
					break;
		
				case 4:
					System.out.println("Finalizando programa...");
					
					break;

				default:
					System.out.println("Opção Inválida!");
					break;

			}
		}while(op != 4);
				
		
		
		
		
	
		






	}




}
