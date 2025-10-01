package br.com.exercicio_30set_2;

public class Sapo extends Animal {
   private boolean temPeleLisa;
   private boolean eVenenoso;

   public Sapo(String nome, int idade, boolean eVertebrado, String classe, boolean temPeleLisa, String genero, boolean eVenenoso){
       super(nome, idade, eVertebrado, classe, genero);
       this.temPeleLisa = temPeleLisa;
       this.eVenenoso = eVenenoso;
   }

   @Override
    public void emitirSom() {
       System.out.println( nome + " diz: rebet");
   }

   @Override
    public void mover(){
       System.out.println( nome + " está pulando!");
   }

   public void comerMosca(){
       System.out.println( nome + " está comendo uma mosca");
   }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Pele lisa: " + (temPeleLisa ? "Sim" : "Não"));
        System.out.println("É venenoso? " + (eVenenoso ? "Sim" : "Não"));
    }


}
