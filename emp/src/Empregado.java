
public class Empregado {

		// aqui basta criar várias variáveis (atributos)
	
		String nome;
		String cargo;
		double salario;
		
		void exibirQuadro(){
			System.out.println(nome+ "  "+cargo+" "+salario );
		
		}
		
				
		void aumentarSalario (double percentual) {
			double novoSalario = salario + salario * percentual / 100;
			salario=novoSalario;
		}
	
}
