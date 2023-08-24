package ProjetoTiposOperadores;
import java.util.Scanner;
public class ClassCalculoViagem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//ENTRADA
		System.out.print("QUAL O TEMPO DA VIAGEM?");
		float temp = scn.nextFloat();
		System.out.print("QUAL A VELOCIDADE MEDIA DO VEICULO NA VIAGEM?");
		float vel = scn.nextFloat();
		//PROCESSAMENTO
		float dist = temp * vel;
		float litros = dist/12;
		//SAIDA
		System.out.printf("A DISTANCIA PERCORRIDA FOI DE: %.0f", (dist));
		System.out.println("KM");
		System.out.printf("E A QUANTIDADE DE GASOLINA FOI DE: %.2f", (litros));
		System.out.print("LITROS!");
	}

}
