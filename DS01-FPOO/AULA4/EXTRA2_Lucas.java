package ProjetoTiposOperadores;
import java.util.Scanner;
public class ClassEleicao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//entrada
		//candA
		System.out.print("QUANTOS VOTOS VALIDOS TEVE O CANDIDATO A?");
		int votocandA = scn.nextInt();
		//candB
		System.out.print("QUANTOS VOTOS VALIDOS TEVE O CANDIDATO B?");
		int votocandB= scn.nextInt();
		//candC
		System.out.print("QUANTOS VOTOS VALIDOS TEVE O CANDIDATO C?");
		int votocandC = scn.nextInt();
		System.out.print("QUANTOS VOTOS BRANCOS TEVE NA ELEIÇÃO?");
		int votobranco = scn.nextInt();
		System.out.print("QUANTOS VOTOS NULOS TEVE NA ELEIÇÃO?");
		int votonull = scn.nextInt();
		
		//processamento
		int eleitores = votocandA + votocandB + votocandC + votobranco + votonull;
		int votosvalidos = (votocandA + votocandB + votocandC)*100 / eleitores;
		int votosvalidosA = votocandA * 100/ eleitores;
		int votosvalidosB = votocandB * 100/ eleitores;
		int votosvalidosC = votocandC * 100/ eleitores;
		int percentbranco = votobranco * 100/ eleitores;
		int percentnull = votonull * 100/ eleitores;
		
		//saida
		
		System.out.println("TOTAL DE ELEITORES:" + eleitores);
		System.out.println("TOTAL DE VOTOS CANDIDATO A " + votosvalidosA + "%");
		System.out.println("TOTAL DE VOTOS CANDIDATO B " + votosvalidosB + "%");
		System.out.println("TOTAL DE VOTOS CANDIDATO C " + votosvalidosC + "%");
		System.out.println("TOTAL DE VOTOS BRANCOS " + percentbranco + "%");
		System.out.print("TOTAL DE VOTOS NULOS " + percentnull + "%");
	}

}
