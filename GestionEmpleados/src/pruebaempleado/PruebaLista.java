package pruebaempleado;
import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(2);
		lista.add(13);
		for (int i : lista) {
			System.out.println(i);
		}
		
		lista.sort(null);
		for (int i : lista) {
			System.out.println(i);
		}

		
	}

}
