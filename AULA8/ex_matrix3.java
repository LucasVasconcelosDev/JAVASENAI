package array;
import java.util.Scanner;
public class ex_matrix3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String estadoCapital[][] = new String[5][2];
		
		for(int i=0;i<5;i++){
			for(int j=0;j<1;j++){
				
				System.out.println("digite o " +(i+1)+ "º estado:");
				estadoCapital[i][0] = scan.nextLine();
				
				System.out.println("digite a capital  :");
				estadoCapital[i][1] = scan.nextLine();
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<1;j++){
				System.out.print(estadoCapital[i][0]);
				System.out.print(" - " + estadoCapital[i][1] + "\n");
			}
		}

	}

}
