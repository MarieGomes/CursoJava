public class ex9{
	public static void main(String[] args){
	
		double salario, reajuste, reajsalario;
		
		System.out.println("Digite seu salario");
		salario = Double.parseDouble(System.console().readLine());

		if(salario<5000){
			reajuste = (salario*30)/100.0;
			reajsalario = salario + reajuste;
			System.out.printf("Seu salario com reajuste é: %f\n",reajsalario);
			
		}
		else
			System.out.println("Você não tem direito ao reajuste, logo seu salário permanece o mesmo.");
	}
}
