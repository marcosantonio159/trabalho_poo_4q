package poo;

public class conta {
	protected String numero;
	protected Pessoa cliente;
	protected double saldo;

	public conta() {
		int n =(int) (Math.random() * 10000 + 1);
		String numConta = "c"+n;
		this.numero = numConta;
	}

	public conta(Pessoa cliente) {
		this();
		this.cliente = cliente;
	}

	public conta(Pessoa cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}

	private String mostra() {
		String saida = "--------------";
		saida += "\nCliente: " + this.cliente.getSobrenome();
		saida += "\nNumero: " + this.numero;
		saida = saida + "\nSaldo :" + this.saldo;
		saida += "\n-------------";
		return saida;
	}
	
	@Override
	public String toString() {
		return "\n"+ mostra();
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public void setCliente(String nome, String sobrenome, int idade) {
		Pessoa cliente = new Pessoa(nome, sobrenome, idade);
		this.cliente = cliente;
	}
}








