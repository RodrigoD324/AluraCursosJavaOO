public class TesteIR_ExercicioAlura {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			double porcentagemIR = 7.5;
			int valorIR = 142;
			System.out.println("Porcentagem de imposto de renda igual, " + porcentagemIR + "%");
			System.out.println("Valor de imposto de renda igual, R$ " + valorIR);
		} else if (salario > 2800.0 && salario <= 3751.0) {
			int porcentagemIR = 15;
			int valorIR = 350;
			System.out.println("Porcentagem de imposto de renda igual, " + porcentagemIR + "%");
			System.out.println("Valor de imposto de renda igual, R$ " + valorIR);
		} else {
			double porcentagemIR = 22.5;
			int valorIR = 636;
			System.out.println("Porcentagem de imposto de renda igual, " + porcentagemIR + "%");
			System.out.println("Valor de imposto de renda igual, R$ " + valorIR);
		}
		
	}
}