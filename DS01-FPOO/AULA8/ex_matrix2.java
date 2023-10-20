package array;
import java.util.Scanner;
public class ex_matrix2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v1 = 0;
		int v2 = 0;
		
		System.out.println("digite o numero de linhas da matriz:");
		v1= scan.nextInt();
		System.out.println("digite o numero de colunas da matriz:");
		v2= scan.nextInt();
		
		char[][] caractere = new char[v1][v2];
		
		for(int i=0;i<v1;i++){
			for(int j=0;j<v1;j++){
				System.out.println("digite o valor para matrix indice[" + i + "][" + j + "] (apenas uma letra!):");
				caractere[i][j] = scan.next().charAt(0);
			}
		}
		for(int i=0;i<v1;i++){
			for(int j=0;j<v1;j++){
				System.out.print(caractere[i][j]);
			}
			System.out.println();
		}
	}

}
