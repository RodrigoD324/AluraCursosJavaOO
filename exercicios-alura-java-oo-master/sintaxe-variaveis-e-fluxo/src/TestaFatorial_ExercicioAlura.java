public class TestaFatorial_ExercicioAlura {

	public static void main(String[] args) {
		int fatorialTotal = 1;
		for(int n = 1; n < 11; n++) {
			fatorialTotal *= n;
			System.out.println("Fatorial de " + n + " = " + fatorialTotal);
		}
	}
}