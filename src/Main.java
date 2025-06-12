
public class Main {

	public static void main(String[] args) {
		Clientes Lucas = new Clientes();
		Lucas.setNome("Venilton");
		
		Conta cc = new ContaCorrente(Lucas);
		Conta poupanca = new ContaPoupanca(Lucas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}