package entities;

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
        double randomNumber = Math.random() * 5;
        int id = (int)randomNumber;
    }

}
