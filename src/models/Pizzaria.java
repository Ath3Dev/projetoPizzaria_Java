package models;

import java.util.ArrayList;

public class Pizzaria {
	private String nome;
	private ArrayList<Pizza> pizza = new ArrayList<>();
	private ArrayList<Motoboy> motoboy = new ArrayList<>();
	
	public void adicionarPizza(Pizza pizza) {
		this.pizza.add(pizza);
	}
	
	public void listarPizzas() {
		for(Pizza pizza : this.pizza ) {
			System.out.println(pizza.getSabor());
		}
	}
	
	public void adicionarMotoboy(Motoboy motoboy) {
		this.motoboy.add(motoboy);
	}
	
	public void listarMotoboys() {
		for(Motoboy motoboy : this.motoboy) {
			System.out.println(motoboy.getNome());
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pizza> getPizza() {
		return pizza;
	}
	public void setPizza(ArrayList<Pizza> pizza) {
		this.pizza = pizza;
	}
	public ArrayList<Motoboy> getMotoboy() {
		return motoboy;
	}
	public void setMotoboy(ArrayList<Motoboy> motoboy) {
		this.motoboy = motoboy;
	}
	
}
