package ProjetoTiposOperadores;
import java.util.Scanner;
//import java.lang.Math;
public class ClassVolumeLata {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//ENTRADA
		System.out.print("QUAL O RAIO DA LATA?");
		float R = scn.nextFloat();
		System.out.print("QUAL A ALTURA DA LATA?");
		double alt = scn.nextFloat();
		//PROCESSAMENTO
		//double vol = 3.14159 * Math.pow(R,2) * alt;
		double vol = 3.14159 * (R*R) * alt;
		//SAIDA
		System.out.print("O VOLUME DA LATA É:");
		System.out.print(vol);
	}

}
