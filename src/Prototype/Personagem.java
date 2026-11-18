package Prototype;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;

    public Personagem(String nome, String classe, int nivel, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Personagem clone(String novoNome) {
        return new Personagem(novoNome, classe, nivel, vida, ataque);
    }

    public String toString() {
        return "Nome: " + nome + " | " + "Classe: " + classe + " | " + "Nível: " + nivel + " | " + "Vida: " + vida + " | " + "Ataque: " + ataque;
    }
}

