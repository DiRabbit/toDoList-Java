package application;

import entities.Quest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> nome;
        nome = new ArrayList<>();

        System.out.println("***Bem Vindo ao To-Do-List***");

        System.out.print("Digite o nome da tarefa: ");
        String name = sc.nextLine();
        nome.add(name);

        Quest quest = new Quest(nome);

        System.out.println(quest);


        sc.close();
    }
}