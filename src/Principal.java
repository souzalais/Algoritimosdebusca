import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int vetordesordenado[]= {88, 31, 96, 52, 45, 19, 68, 70, 29, 90};
		int vetorordenado[]= {19,29,31, 45,52,68,70,88,90,96};
		System.out.println("Qual valor deseja buscar?");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		buscaLinear(n,vetordesordenado);
		buscaBin�ria(n, vetorordenado);
	}

	private static void buscaLinear(int n, int[] vetor) {
		boolean encontrou = false;
		int i;
		for(i=0; i>vetor.length;i++) {
			if(n== vetor[i]) {
				encontrou = true;
				
			}
		
		}
		
		if(encontrou)System.out.println("encontrei o n�mero"+n+"na posi��o"+i); //*chave do if
		else System.out.println("N�o encontrei este n�mero no vetor");
	}
	
	private static void buscaBin�ria(int n, int[] vetor) {
		int in�cio = 0;
		int fim = vetor.length;
		boolean encontrou = false;
		int posi��om�dia = -1;
		while(in�cio <=fim) {
			posi��om�dia 
		}
		
		
	}

	
}
