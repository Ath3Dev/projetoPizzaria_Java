package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import models.GestaoPizzaria;
import models.Motoboy;
import models.Pizzaria;

public class Sistema {

	public static void main(String[] args) {
		GestaoPizzaria gestaoPizzaria = new GestaoPizzaria();
		int escolha;
		 Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Adicionar Pizzaria");
			System.out.println("2. Adicionar Motoboy");
			System.out.println("3. Listar Pizzarias");
			System.out.println("4. Listar Pizzas de uma Pizzaria");
			System.out.println("5. Listar Motoboys");
			System.out.println("0. Sair");
			
			escolha = sc.nextInt();
			
			
		} while (escolha != 0);

	}

}
