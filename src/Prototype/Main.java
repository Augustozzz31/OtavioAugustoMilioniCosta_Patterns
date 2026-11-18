package Prototype;

public class Main {
    static void main() {
        Personagem personagemBase = new Personagem("Augusto","Guerreiro", 10,20,15);

        System.out.println("Personagem base: ");
        System.out.println(personagemBase);

        System.out.println("\nPersonagens clonados: ");

        Personagem personagem1 = personagemBase.clone("Arthur");
        System.out.println(personagem1);

        Personagem personagem2 = personagemBase.clone("Bob");
        System.out.println(personagem2);

        Personagem personagem3 = personagemBase.clone("Diego");
        System.out.println(personagem3);
    }
}
