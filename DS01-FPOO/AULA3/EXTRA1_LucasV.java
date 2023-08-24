package ProjetoTiposOperadores;
import java.util.Scanner;
public class Class_troca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("INSIRA O VALOR DE A:");
		float A = scn.nextFloat();
		System.out.print("INSIRA O VALOR DE B:");
		float B = scn.nextFloat();
		System.out.println("PROCESSANDO...");
		float C = A;
		A = B;
		B = C;
		System.out.println("O VALOR DE A:" + (A));
		System.out.println("O VALOR DE B:" + (B));

	}

}
