package ProjetoTiposOperadores;
import java.util.Scanner;
public class ClassNumero2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num= new int[3];
		int par = 0;
		int impar = 0;
		int pos = 0;
		int neg = 0;
		int neut = 0;
		//ENTRADA
		for(int i=0; i<3; i++) {
			System.out.println("DIGITE O " + i + " NUMERO:");
			num[i] = scn.nextInt();
		} 
		//MAIOR NUMERO
		if(num[0]>num[1] && num[0]>num[2]){
			System.out.println("O MAIOR VALOR DIGITADO: " + num[0]);
		}else if(num[1]>num[0] && num[1]>num[2]){
			System.out.println("O MAIOR VALOR DIGITADO: " + num[1]);
		}else {
			System.out.println("O MAIOR VALOR DIGITADO: " + num[2]);
		}
		//MENOR NUMERO
		if(num[0]<num[1] && num[0]<num[2]){
			System.out.println("O MENOR VALOR DIGITADO: " + num[0]);
		}else if(num[1]<num[0] && num[1]<num[2]){
			System.out.println("O MENOR VALOR DIGITADO: " + num[1]);
		}else {
			System.out.println("O MENOR VALOR DIGITADO: " + num[2]);
		}
		//SOMA
		int soma = num[0] + num[1] + num[2];
		System.out.println("A SOMA DOS VALORES: " + soma);
		//MEDIA
		int media = soma/3;
		System.out.println("A MEDIA DOS VALORES: " + media);
		//PAR E IMPAR
		for(int i=0; i<3; i++){
			if(num[i]%2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("NUMERO DE VALORES PAR: " + par);
		System.out.println("NUMERO DE VALORES IMPAR: " + impar);
		//POSITIVOS NEGATIVOS E NEUTROS
		for(int i=0; i<3; i++) {
			if(num[i]>0) {
				pos++;
			}else if(num[i]<0){
				neg++;
			}else {
				neut++;
			}
		}
		System.out.println("NUMEROS POSITIVOS DIGITADOS: " + pos);
		System.out.println("NUMEROS NEGATIVOS DIGITADOS: " + neg);
		System.out.println("NUMEROS NEUTROS DIGITADOS: " + neut);
	}

}
