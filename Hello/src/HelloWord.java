import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		System.out.println("Primeiro programa eclipse");
		Scanner teclado = new Scanner(System.in);
		int a;
		a = teclado.nextInt();
		System.out.println("Voce digitou = "+a);
		
		teclado.close();
	}
}
