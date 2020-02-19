public class exava{
	public static void main(String[] argss){
	
		double nota1,nota2,nota3,media,notaexame;

		System.out.print("Digite a nota do primeiro semestre: ");
		nota1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a nota do segundo semestre: ");
		nota2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a nota do terceiro semestre: ");
		nota3 = Double.parseDouble(System.console().readLine());
		
		media = (nota1 + nota2 + nota3)/3;

		if(media < 3)
			System.out.printf("Você foi reprovado com nota %f\n",media);
		
		if(media >= 3 && media < 7){
			System.out.printf("Você ficou de exame com nota %f\n",media);
			notaexame = 12 - media;
			System.out.printf("Para que você seja aprovadx no exame, deve tirar a nota %f\n",notaexame);
		}
	
		if(media >= 7)
			System.out.printf("Você foi aprovado com nota %f\n",media);

	}
}
