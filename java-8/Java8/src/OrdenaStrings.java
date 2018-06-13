import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * OrdenaString
 * 
 * Dada uma lista de strings, faz a ordenação a partir do tamanho 
 * 
 * @author FERNANDA
 *
 */
public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		// Comparação por Lambdas
		//palavras.sort( Comparator.comparing( String::hashCode ) );
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		// Comparação Normal
		/*Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);*/
				
		palavras.forEach(System.out::println);
	}

}