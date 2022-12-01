
// Contrato Autenticável
	// Quem assinar esse contrato, precisa implementar
		// Método setSenha
		// Método autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}