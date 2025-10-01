package br.com.exercicio_30set_2;

public class Gato extends Animal {
    private boolean temPeloLongo;

    public Gato(String nome, int idade, boolean temPeloLongo, boolean eVertebrado, String classe, String genero) {
        super(nome, idade, eVertebrado, classe, genero);
        this.temPeloLongo = temPeloLongo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Pelo longo: " + (temPeloLongo ? "Sim" : "Não"));
    }
}
