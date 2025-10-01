package br.com.exercicio_30set_2;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected Boolean eVertebrado;
    protected String classe;
    protected String genero;

    public Animal(String nome, int idade, boolean eVertebrado, String classe, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.eVertebrado = eVertebrado;
        this.classe = classe;
        this.genero = genero;
    }

    public abstract void emitirSom();

    public void mover() {
        System.out.println(nome + " está se movendo...");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        if(eVertebrado == true){
            System.out.println("Vertebrado");
        }else {
            System.out.println("Invertebrado");
        }
        System.out.println("Clase: " + classe);
        System.out.println("Gênero: " + genero);
    }

}


