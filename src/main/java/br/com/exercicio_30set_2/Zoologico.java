package br.com.exercicio_30set_2;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Labrador", true, "Mamífero", "Masculino"),
                new Gato("Mimi", 2, true, true, "Mamífero", "Feminino"),
                new Passaro("Piu", 1, 15.5, true, "Ave", "Feminino"),
                new Sapo("Froggers", 3, true, "Anfíbio", true, "Masculino", true),
                new Mosquito("Mosquitão do Mal", 1,false,"Inseto", "Feminino",true)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo em ação
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            // Downcasting seguro
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            }
            System.out.println("---");
        }
    }
}