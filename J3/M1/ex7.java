public class ex7{
	public static void main(String[] args){
		
		int canal,contadores, cont[] = new int[10];

		for (int x=0; x<10; x++)
			cont[x] = 0;
		
		for(contadores = 0; contadores < 11; contadores++){
			System.out.print("Digite o canal que você mais assiste: ");
			canal = Integer.parseInt(System.console().readLine());
			cont[canal]+=1;
		
		}
		
		for(int x=0; x<10;x++)
			System.out.printf("%d pessoas assistem o canal %d\n",cont[x],x);
				






	}


}
