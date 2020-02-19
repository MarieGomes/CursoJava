public class at06 {
	public static void main(String[] args){

		double vendas,salariobase,comis,salario;
		System.out.println("Digite seu salario");
		salariobase = Double.parseDouble(System.console().readLine());
		System.out.println("Digite o valor de suas vendas");
		vendas = Double.parseDouble(System.console().readLine());
		comis = vendas*4/100.0;
		salario = salariobase + comis;

		System.out.printf("Seu salário será : %f\n",salario);
	
	}
}
	
