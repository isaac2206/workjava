
public class Conta {
public static void main(String[] args) {
		
		Cliente f1 = new Cliente();
		
		f1.cpfTitular  = "0012";
		f1.nomeTitular = "jao";
		f1.numeroConta  = 222;
		f1.digitoVerif = 9;
		f1.saldo = 10000;
				
				
		// exibindo os anuncios
		System.out.println(f1.exibirInfo());
		
		
	}
}

