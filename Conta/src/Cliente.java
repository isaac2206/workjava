
public class Cliente {
	
	String cpfTitular;
	String nomeTitular;
	double saldo;
	int    numeroConta;
	int    digitoVerif;
	
	String exibirInfo() {
		String res = numeroConta +" "+digitoVerif;
		return res;
	}
	void creditar(double valor)	{	
	saldo += valor;
	}
	
	boolean debitar(double valor) {
		if(saldo>=valor) {
			saldo -=valor;
			return true;
		}
		else {
			return false;
		}
	}
}