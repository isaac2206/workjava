import java.util.Scanner;

public class Banco {  //Posto
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//abastecimento c1  = new abastecimento("gas",3.99,10,39.9);
		
		//System.out.println(c1.exibirInfo());
		
		int opcao,opcao2;
		double valor,valorLitro;
		
		
//		c1.setNumeroConta(100123);
//		c1.setDigitoVerif(4);  
//		c1.setCpfTitular("987.654.321-00");		
//		c1.setNomeTitular("Professor Isidro");
//		c1.setSaldo(0.0);
		
			System.out.println("Abastecimento");
			System.out.println("Digite 1 - Gas / 2 - Alcool / 3 - Diesel");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Por litros(1) ou valor(2)?");
				opcao2 = teclado.nextInt();
				switch(opcao2) {
				case 1:
					System.out.print("Digite a qtde de litros");
					valorLitro=3.99;
					valor = teclado.nextDouble();
					c1.porLitro(valor);
					break;			
				case 2:
					System.out.print("Digite o valor");
					valor = teclado.nextDouble();
					valorLitro=3.99;
					c1.porValor(valor);
					break;
					}
			case 2:
				System.out.print("Por litros(1) ou valor(2)?");
				opcao2 = teclado.nextInt();
				switch(opcao2) {
				case 1:
					System.out.print("Digite a qtde de litros");
					valor = teclado.nextDouble();
					c1.porLitro(valor);
					valorLitro=3.0;
					break;			
				case 2:
					System.out.print("Digite o valor");
					valor = teclado.nextDouble();
					c1.porValor(valor);
					valorLitro=3.0;
					break;
				}
			case 3:
				System.out.print("Por litros(1) ou valor(2)?");
				opcao2 = teclado.nextInt();
				switch(opcao2) {
				case 1:
					System.out.print("Digite a qtde de litros");
					valor = teclado.nextDouble();
					c1.porLitro(valor);
					valorLitro=3.1;
					break;			
				case 2:
					System.out.print("Digite o valor");
					valor = teclado.nextDouble();
					c1.porValor(valor);
					valorLitro=3.1;
					break;
					}
			}
	}
}