
public class Ficha {
	public static void main(String[] args) {
		
		Empregado f1, f2;  // declarei uma variável c1 do tipo Carro
				
		// antes de começar a preencher os dados, preciso criar a área de memória
		f1 = new Empregado();
		f2 = new Empregado();
		
		f1.nome  = "jao";
		f1.cargo = "pemba";
		f1.salario  = 900;
				
		f2.nome  = "ze";
		f2.cargo = "pembinha";
		f2.salario = 800;
	
		
		// exibindo os anuncios
		f1.exibirQuadro();
		f2.exibirQuadro();
		
		f1.aumentarSalario(10);
		f2.aumentarSalario(10);

		f1.exibirQuadro();
		f2.exibirQuadro();
		
		//System.out.println(" Novo salario "+ f1.aumentarSalario(10.0));
		//System.out.println(" Novo salario "+ f2.aumentarSalario(10.0));
		
	}
}
