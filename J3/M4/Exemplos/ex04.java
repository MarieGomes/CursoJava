public class ex04{
	
	static int hrs(int min){
		int horas;
		horas = min/60;
		return horas;
	
	}
	static int mts(int min){
			int minutos;
			minutos = min%60;
			return minutos;
		
		}
	
	public static void main(String[] args){	
		int minutos;
		
		System.out.print("Digite os minutos a serem convertidos em horas: ");
		minutos = Integer.parseInt(System.console().readLine());
		System.out.printf("O Horário convertido é %02d : %02d \n",hrs(minutos),mts(minutos));
		
		


	}


}
