package ProjetoTiposOperadores;
import java.util.Scanner;
public class Class_prestacao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//ENTRADA
		System.out.print("DIGITE O VALOR TOTAL:");
		float valor = scn.nextFloat();
		System.out.print("INSIRA O VALOR DA TAXA:");
		float taxa = scn.nextFloat();
		System.out.print("INSIRA A QUANTIDADE DE PARCELAS:");
		int tempo = scn.nextInt();
		//PROCESSAMENTO
		float prest = valor + (valor * (taxa / 100) * tempo);
		//SAIDA
		System.out.printf("O VALOR DE CADA PARCELA É DE: %.2fR$", (prest));
	}

}
