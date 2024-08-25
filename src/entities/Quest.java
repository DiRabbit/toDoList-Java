package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quest {
    private List<String> nome;
    private boolean concluida;
    private int id;

    public Quest() {}

    public Quest(List<String> nome) {
        this.nome = nome;
        setConcluida(false);
        gerarId();
    }

    public List<String> getNome() {
        return nome;
    }

    public boolean isConcluida() {
        return concluida;
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

    @Override
    public String toString() {
        return "Quest: " +
                "nome= " + nome +
                ", concluida= " + concluida +
                ", id= " + id ;
    }
}
