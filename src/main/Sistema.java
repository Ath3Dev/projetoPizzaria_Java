package main;

// Importações necessárias para utilizar Scanner e as classes do modelo
import java.util.Scanner;
import models.GestaoPizzaria;
import models.Motoboy;
import models.Pizza;
import models.Pizzaria;

// Classe principal do sistema teste
// outro teste
public class Sistema {
    public static void main(String[] args) {
        // Inicialização do Scanner para entrada do usuário e da classe de gestão de pizzarias
        Scanner sc = new Scanner(System.in);
        GestaoPizzaria gestaoPizzaria = new GestaoPizzaria();

        // Variável para armazenar a escolha do usuário
        int escolha;

        // Loop principal do sistema
        do {
            // Exibição do menu
            System.out.println("\n=== Sistema de Pizzaria ===");
            System.out.println("1. Adicionar Pizzaria");
            System.out.println("2. Adicionar Motoboy");
            System.out.println("3. Adicionar Pizza ao Menu de uma Pizzaria");
            System.out.println("4. Listar Pizzarias");
            System.out.println("5. Listar Motoboys de uma Pizzaria");
            System.out.println("6. Listar Pizzas de uma Pizzaria");
            System.out.println("0. Sair");

            // Solicitação da escolha do usuário
            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();

            // Estrutura de controle para cada opção do menu
            switch (escolha) {
                case 1:
                    // Opção 1: Adicionar Pizzaria
                    System.out.println("\nInforme o nome da Pizzaria: ");
                    String nomePizzaria = sc.next();

                    // Criação de uma nova pizzaria e adição à gestão de pizzarias
                    Pizzaria novaPizzaria = new Pizzaria();
                    novaPizzaria.setNome(nomePizzaria);
                    gestaoPizzaria.adicionarPizzaria(novaPizzaria);
                    System.out.println("Pizzaria adicionada com sucesso!");
                    break;

                case 2:
                    // Opção 2: Adicionar Motoboy a uma Pizzaria
                    System.out.println("Escolha a pizzaria para adicionar o Motoboy:");
                    gestaoPizzaria.listarPizzarias();

                    // Solicitação da escolha da pizzaria para adicionar o motoboy
                    System.out.print("Digite o número da Pizzaria Cadastrada: ");
                    int pizzariaEscolhida = sc.nextInt();

                    /*
                     * Obtendo o tamanho da lista de pizzarias no objeto gestaoPizzaria, assim
                     * representando o número total de pizzarias disponíveis. E verificando se o
                     * número escolhido pelo usuário está dentro do intervalo válido. Garante que o
                     * número seja maior que zero e não ultrapasse o número total de pizzarias
                     * disponíveis.
                     */
                    if (pizzariaEscolhida > 0 && pizzariaEscolhida <= gestaoPizzaria.getPizzaria().size()) {
                        // Obtém a pizzaria selecionada com base no número escolhido pelo usuário
                        Pizzaria pizzariaSelecionada = gestaoPizzaria.getPizzaria().get(pizzariaEscolhida - 1);

                        // Solicitação das informações do Motoboy
                        System.out.print("Informe o nome do Motoboy: ");
                        String nomeMotoboy = sc.next();
                        System.out.print("Informe o modelo da Moto: ");
                        String modeloMoto = sc.next();

                        // Criação de um novo motoboy e adição à pizzaria selecionada
                        Motoboy novoMotoboy = new Motoboy(nomeMotoboy, modeloMoto);
                        pizzariaSelecionada.adicionarMotoboy(novoMotoboy);
                        System.out.println("Motoboy adicionado com Sucesso!");
                    } else {
                        // Mensagem de erro se a pizzaria não for encontrada
                        System.out.println("Pizzaria não encontrada.");
                    }
                    break;

                case 3:
                    // Opção 3: Adicionar Pizza ao Menu de uma Pizzaria
                    System.out.println("Escolha a pizzaria para adicionar pizza ao menu: ");
                    gestaoPizzaria.listarPizzarias();

                    // Solicitação da escolha da pizzaria para adicionar a pizza
                    System.out.println("Digite o número da Pizzaria Cadastrada: ");
                    pizzariaEscolhida = sc.nextInt();

                    if (pizzariaEscolhida > 0 && pizzariaEscolhida <= gestaoPizzaria.getPizzaria().size()) {
                        // Obtém a pizzaria selecionada com base no número escolhido pelo usuário
                        Pizzaria pizzariaSelecionada = gestaoPizzaria.getPizzaria().get(pizzariaEscolhida - 1);

                        // Solicitação das informações da Pizza
                        System.out.print("Informe o sabor da Pizza: ");
                        String saborPizza = sc.next();
                        System.out.print("Informe o valor da Pizza: ");
                        double precoPizza = sc.nextDouble();

                        // Criação de uma nova pizza e adição à pizzaria selecionada
                        Pizza novaPizza = new Pizza(saborPizza, precoPizza);
                        pizzariaSelecionada.adicionarPizza(novaPizza);
                        System.out.println("Pizza adicionada com sucesso!");
                    } else {
                        // Mensagem de erro se a pizzaria não for encontrada
                        System.out.println("Pizzaria não encontrada.");
                    }
                    break;

                case 4:
                    // Opção 4: Listar Pizzarias
                    System.out.println("Pizzarias Cadastradas: ");
                    gestaoPizzaria.listarPizzarias();
                    break;

                case 5:
                    // Opção 5: Listar Motoboys de uma Pizzaria
                    System.out.println("Escolha a pizzaria para listar os motoboys: ");
                    gestaoPizzaria.listarPizzarias();

                    // Solicitação da escolha da pizzaria para listar os motoboys
                    System.out.print("\nDigite o número da Pizzaria Cadastrada: ");
                    pizzariaEscolhida = sc.nextInt();

                    // Verifica se o número da pizzaria escolhida está dentro do intervalo válido
                    if (pizzariaEscolhida > 0 && pizzariaEscolhida <= gestaoPizzaria.getPizzaria().size()) {
                        // Obtém a pizzaria selecionada com base no número escolhido pelo usuário
                        Pizzaria pizzariaSelecionada = gestaoPizzaria.getPizzaria().get(pizzariaEscolhida - 1);

                        // Listar motoboys da pizzaria
                        pizzariaSelecionada.listarMotoboys();
                    } else {
                        // Mensagem de erro se a pizzaria não for encontrada
                        System.out.println("Pizzaria não encontrada.");
                    }
                    break;

                case 6:
                    // Opção 6: Listar Pizzas de uma Pizzaria
                    System.out.println("Escolha a pizzarias para listar o menu de Pizzas: ");
                    gestaoPizzaria.listarPizzarias();

                    // Solicitação da escolha da pizzaria para listar as pizzas
                    System.out.println("Digite o número da Pizzaria Cadastrada: ");
                    pizzariaEscolhida = sc.nextInt();

                    // Verifica se o número da pizzaria escolhida está dentro do intervalo válido
                    if (pizzariaEscolhida > 0 && pizzariaEscolhida <= gestaoPizzaria.getPizzaria().size()) {
                        // Obtém a pizzaria selecionada com base no número escolhido pelo usuário
                        Pizzaria pizzariaSelecionada = gestaoPizzaria.getPizzaria().get(pizzariaEscolhida - 1);

                        // Listar pizzas da pizzaria
                        pizzariaSelecionada.listarPizzas();
                    } else {
                        // Mensagem de erro se a pizzaria não for encontrada
                        System.out.println("Pizzaria não encontrada.");
                    }
                    break;

                case 0:
                    // Opção 0: Sair do Sistema
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    // Mensagem de erro para escolhas inválidas
                    System.out.println("ERRO!! Opção inválida.");
            }

            // Loop continua enquanto a escolha do usuário não for 0 (Sair)
        } while (escolha != 0);
    }
}
