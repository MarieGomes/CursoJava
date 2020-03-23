public class at01{
	public static void main(String[] args){
	
		int idade,numpes,maiorid=-1,menorid,mul=0;
		double salario,somasal=0,mediasal;
		char genero;
		

		do {
			
			numpes++;

			if(idade > 0){
				System.out.print("Digite sua idade: ");
				idade = Integer.parseInt(System.console().readLine());
				System.out.print("Digite seu salário: ");
				salario = Double.parseDouble(System.console().readLine());
				System.out.print("Digite seu gênero (F para Feminino ou M para Masculino): ");
				genero = System.console().readLine().charAt(0);
				
				somasal = somasal + salario;
				
				if(idade>maiorid)
					maiorid = idade;
				else
					menorid=idade;

				if(genero == 'F'){
					if(salario<=1500)
						mul++;
				}

				
				
				
			}		


		}while(idade>0);
		
		mediasal= somasal/numpes;
	
			







	}

}
