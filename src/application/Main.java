package application;

import entities.Quest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***Bem Vindo ao To-Do-List***");

        int n = sc.nextInt();

        criarQuest(n);

        System.out.println("***Até a próxima***");

        sc.close();
    }

    public static void criarQuest(int n){
        Scanner sc = new Scanner(System.in);

        Quest[] quest = new Quest[n];

        for (int i = 0; i <= quest.length-1; i++) {
            String nomeDoProduto = sc.nextLine();
            quest[i] = new Quest(nomeDoProduto);
            System.out.println("A tarefa " + quest[i].getNome() + " cujo o id é: " + quest[i].getId() + " foi criada com sucesso!");
        }

        sc.close();
    }

}