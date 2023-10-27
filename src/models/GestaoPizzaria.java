package models;

import java.util.ArrayList;

public class GestaoPizzaria {
	private ArrayList<Pizzaria> pizzaria = new ArrayList<>();
	
	public void adicionarPizzaria(Pizzaria pizzaria) {
		this.pizzaria.add(pizzaria);
	}
	
	public void listarPizzarias() {
		for(Pizzaria pizzaria : this.pizzaria) {
			System.out.println(pizzaria.getNome());
		}
	}
	
}
