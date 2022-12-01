class Conta {
<<<<<<< HEAD
	private double saldo;
=======
	double saldo;
>>>>>>> d7a3072908b4cfa18fd935321d64dd468218c162
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
<<<<<<< HEAD
	public double getSaldo() {
		return this.saldo;
	}
	
=======
>>>>>>> d7a3072908b4cfa18fd935321d64dd468218c162
}