package entities;

import java.util.Random;

public class Quest {
    private String nome;
    private boolean concluida;
    private int id;

    public Quest(String nome) {
        setNome(nome);
        setConcluida(false);
        gerarId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

     public int getId() {
         return id;
     }

     public void concluir() {
        setConcluida(true);
        System.out.println("A Task " + getNome() + " cujo id é: " + getId() + " foi concluída com sucesso!");
    }

    public void gerarId() {
        Random rand = new Random();
        int upperbound = 50;
        id = rand.nextInt(upperbound);
    }

}
