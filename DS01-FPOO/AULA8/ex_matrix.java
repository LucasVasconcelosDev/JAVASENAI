package array;
import java.util.Scanner;
public class ex_matrix {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float matrix[][] = new float[2][3];
		float maior[] = new float[2];
		float soma=0;
		float media=0;
		float quadrado=0;
		int par=0;
		int impar=0;
		
		//entrada
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println("digite o valor para matrix indice[" + i + "][" + j + "]:");
				matrix[i][j] = scan.nextFloat();
			}
		}
		//soma
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				soma += matrix[i][j];
			}
		}
		System.out.println("soma dos elementos: " + soma);
		//media
		media = (matrix[0][0]+matrix[0][1]+matrix[0][2]+matrix[1][0]+matrix[1][1]+matrix[1][2])/6;
		System.out.println("media dos elementos: " + media);
		
		//maior
		for(int i=0;i<2;i++){
			if(matrix[i][0] > matrix[i][1] && matrix[i][0] > matrix[i][2]){
				maior[i]=matrix[i][0];
			}else if(matrix[i][1] > matrix[i][0] && matrix[i][1] > matrix[i][2]){
				maior[i]=matrix[i][1];
			}else {
				maior[i]=matrix[i][2];
			}
		}
		if(maior[0]>maior[1]) {
			System.out.println("maior numero digitado: " + maior[0]);
		}else {
			System.out.println("maior numero digitado: " + maior[1]);
		}
		
		//menor
		for(int i=0;i<2;i++){
			if(matrix[i][0] < matrix[i][1] && matrix[i][0] < matrix[i][2]){
				maior[i]=matrix[i][0];
			}else if(matrix[i][1] < matrix[i][0] && matrix[i][1] < matrix[i][2]){
				maior[i]=matrix[i][1];
			}else {
				maior[i]=matrix[i][2];
			}
		}
		if(maior[0]<maior[1]) {
			System.out.println("menor numero digitado: " + maior[0]);
		}else {
			System.out.println("menor numero digitado: " + maior[1]);
		}
		//par e impar
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				if(matrix[i][j] % 2 == 0){
					par++;
				}
				else {
					impar++;
				}
			}
		}
		System.out.println("pares digitados: " + par);
		System.out.println("impares digitados: " + impar);
		
		//quadrado
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				quadrado= matrix[i][j]*matrix[i][j];
				System.out.println("o quadrado do elemento [" + i + "][" + j + "]:" + quadrado);
			}
		}
		//porcentagem par impar
		System.out.println("porcentagem de elementos pares: " + par*100/6 + "%");
		System.out.println("porcentagem de elementos impares: " + impar*100/6 + "%");
	}
}
