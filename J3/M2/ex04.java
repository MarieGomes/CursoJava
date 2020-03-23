public class ex04{
	public static void main(String[] args){
		int A[] = new int[5],B[] = new int[5],sub;
		


		System.out.println("Digite as posições do vetor A");
		for(int x=0;x<5;x++){
			System.out.printf("%dª posição: ",x+1);
			A[x] = Integer.parseInt(System.console().readLine());

		}

		System.out.println("Digite as posições do vetor B");
		for(int x=0;x<5;x++){
			System.out.printf("%dª posição: ",x+1);
			B[x] = Integer.parseInt(System.console().readLine());

		}
		
		for(int x=0;x<5;x++){
			sub = A[x] - B[4-x];
			System.out.printf("A subtração da posição %d do vetor A e da posição %d do vetor B é:\n%d - %d = %d\n",x+1,5-x,A[x],B[4-x],sub);
			
		}



	}


}
