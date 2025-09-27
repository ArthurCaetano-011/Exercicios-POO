package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario {

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, Double salarioBase, int horasExtras, Double valorHoraExtra) {
        super(nome, matricula, salarioBase); // Alcançar atributos da Classe Pai
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;

    }

    @Override
    public double calcularSalario() {
        //Escopo de variável
         double teste = 1.9;


        return salarioBase + (valorHoraExtra * horasExtras);
    }

    public void registrarHorasExtras(int horas){
        this.horasExtras += horas;
    }

}

