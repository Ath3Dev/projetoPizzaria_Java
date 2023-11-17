package models;

import java.util.ArrayList;

public class GestaoPizzaria {
	private ArrayList<Pizzaria> pizzaria = new ArrayList<>();
	
	public void adicionarPizzaria(Pizzaria pizzaria) {
		this.pizzaria.add(pizzaria);
	}
	
	public void listarPizzarias() {
		int id =0;
		for(Pizzaria pizzaria : this.pizzaria) {
			id += 1;
			System.out.println(id + ". " + pizzaria.getNome());
		}
	}

	public ArrayList<Pizzaria> getPizzaria() {
		return pizzaria;
	}

	public void setPizzaria(ArrayList<Pizzaria> pizzaria) {
		this.pizzaria = pizzaria;
	}
	
}
