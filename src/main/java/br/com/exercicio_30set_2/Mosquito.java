package br.com.exercicio_30set_2;

public class Mosquito extends Animal {

    private boolean transmiteDoencas;

    public Mosquito(String nome, int idade, Boolean eVertebrado, String classe, String genero, Boolean transmiteDoenças){
        super(nome, idade, eVertebrado, classe, genero);
        this.transmiteDoencas = transmiteDoencas;
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " Zuuuummmmm!");
    }

    @Override
    public void mover(){
        System.out.println(nome + " está voando");
    }

    public void sugarSangue(){
    System.out.println(nome + " está sugando sangue!");
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Transmite doenças: " + (transmiteDoencas ? "Sim" : "Não"));
    }

}
