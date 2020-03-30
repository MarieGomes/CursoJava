public class ex05{
	static void modificaVetor(int b []){
		
		for (int x=0; x<b.length;x++)
			b[x] *= 2;
	}
	
	public static void main(String[] args){
		int[] numeros = {1,2,3,4,5};
		
		System.out.print("Valores originais: ");
		for(int pos=0; pos<5; pos++)
			System.out.println(numeros[pos] + " ");
		
		modificaVetor(numeros);
		
		System.out.print("Valores modificados: ");
		for(int pos= 0; pos < 5; pos++)
			System.out.println(numeros[pos] + " ");

	}

}
