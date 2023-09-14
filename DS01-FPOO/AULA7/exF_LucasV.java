package ExtraJava;

public class Class_divisor4 {

	public static void main(String[] args) {
		System.out.println("numeros divisiveis por 4 de 1 a 200:");
		
		for(int i=0; i<=200; i++) {
			if(i%4==0) {
				System.out.println(i);
			}
		}
	}
}
