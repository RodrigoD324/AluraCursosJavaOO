public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		float pontoFlutuante = 3.14f;
		
		int valor = (int)salario;
		System.out.println(valor);
		
		long numeroGrande = 4848485185185l;
		short valorPequeno = 2115;
		byte valorMinusculo = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}