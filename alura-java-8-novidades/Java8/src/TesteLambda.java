
public class TesteLambda {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}
}