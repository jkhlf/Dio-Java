
public class Main {

	public static void main(String[] args) {
		Cliente tioPhill = new Cliente();
		tioPhill.setNome("Tio Phill");
		
		Conta c = new ContaCorrente(tioPhill);
		Conta poupanca = new ContaPoupanca(tioPhill);

		Cliente Fernando = new Cliente();
		Fernando.setNome("Fernando");
		
		Conta c1 = new ContaCorrente(Fernando);
		Conta poupanca1 = new ContaPoupanca(Fernando);

		c.depositar(400);
		c.transferir(300, poupanca);
		
		c.imprimirExtrato();
		poupanca.imprimirExtrato();
		c.listarContas();

		
		c1.depositar(400);
		c1.transferir(300, poupanca);
		
		c1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		c1.listarContas();
	}

}