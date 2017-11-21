import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> s1.length() - s2.length());

		palavras.forEach(s -> System.out.println(s));

		/*new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable");

			}
		}).start();*/
		
		new Thread(() -> System.out.println("executando um runnable")).start();;
	}

}