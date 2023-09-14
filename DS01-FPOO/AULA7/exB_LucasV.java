package ExtraJava;
import java.util.Scanner;
public class Class_tabuada {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.print("digite um numero para ver sua tabuada:");
		int num = scn.nextInt();
		
		//processamento e saida
		for(int i=1; i<=10; i++) {
			System.out.println(i + "X" + num + "=" + num*i);
		}

	}

}
