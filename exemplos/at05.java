public class at05 {
	public static void main(String[] args){

		double salariobase,desconto,aumento,salario;
		System.out.println("Digite o salario");
		salariobase = Double.parseDouble(System.console().readLine());
		aumento = salariobase*5/100.0;
		desconto = salariobase*7/100.0;
		salario = salariobase - desconto + aumento;

		System.out.printf("Seu salário será : %f\n",salario);
	
	}
}
	
