package principal;

import java.util.Hashtable;

import entities.Caixa;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		Hashtable<String, Double> hashtable = new Hashtable<String, Double>();

		hashtable.put("Banana", 0.99);
		hashtable.put("Energético", 5.49);
		hashtable.put("Arroz", 5.49);
		hashtable.put("Chocolate", 4.50);
		hashtable.put("Leite", 4.50);
		hashtable.put("Abacaxi", 2.40);
		
		Caixa caixa = new Caixa();
		
	}
}