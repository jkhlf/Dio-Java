public abstract  class Conta implements InterfaceConta {

	private static final String Agencia = "009";
	private static int inicial = 1;

	protected String agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected String type;

	public Conta(Cliente cliente, String type) {
		this.agencia = Conta.Agencia;
		this.numero = inicial++;
		this.cliente = cliente;
		this.type = type;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque feito.");
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public String getType() {
		return this.type;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	protected void imprimirExtratoConta() {
		System.out.printf("Titular: %s\n", this.cliente.getNome());
		System.out.printf("Tipo de Conta: %s\n", this.getType());
		System.out.printf("Agencia: %s\n", this.getAgencia());
		System.out.printf("Numero da Conta: %d\n", this.getNumero());
		System.out.printf("Saldo: %.2f%n\n\n", this.getSaldo());
	}

	protected void listarContas() {
		System.out.printf( this.cliente.getNome(), this.getType(), this.getAgencia(), this.getNumero());
	}

}