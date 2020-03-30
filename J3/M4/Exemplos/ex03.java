public class ex03{


		static int soma(int n1, int n2){
			
			int somatoria=0;
			
			for(int i=n1 + 1;i<n2;i++)
				somatoria += i;
			
			return somatoria;
		}	
		
		public static void main(String[] args){
		
			int N1,N2;
			
			System.out.print("Digite o primeiro número: ");
			N1 = Integer.parseInt(System.console().readLine());
			System.out.print("Digite o segundo número: ");
			N2 = Integer.parseInt(System.console().readLine());

			System.out.printf("A somatória dos números entre N1 e N2 é %d\n",soma(N1,N2));



		}	


}
