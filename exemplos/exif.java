public class exif{
	public static void main(String[] args){
		
		double N1,N2,N3,N4, media;
		
		System.out.print("Digite sua nota do primeiro semestre: ");	
		N1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite sua nota do segundo semestre: ");	
		N2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite sua nota do terceiro semestre: ");	
		N3 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite sua nota do quarto semestre: ");	
		N4 = Double.parseDouble(System.console().readLine());
	
		media = (N1+N2+N3+N4)/4;
		System.out.printf("Sua media é %f\n",media);

		if (media >= 7)
			System.out.println("Você foi aprovadx!");
		else
			System.out.println("Você foi reprovadx!");
		
		



	}

}
