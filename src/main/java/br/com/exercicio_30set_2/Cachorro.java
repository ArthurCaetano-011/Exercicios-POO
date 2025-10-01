package br.com.exercicio_30set_2;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca, boolean eVertebrado,String classe, String genero) {
        super(nome, idade, eVertebrado, classe, genero);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}

