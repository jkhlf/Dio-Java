
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente, "Poupanca");
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança");
		super.imprimirExtratoConta();
	}
}