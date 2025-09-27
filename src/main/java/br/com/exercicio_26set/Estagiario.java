package br.com.exercicio_26set;

public class Estagiario  extends Funcionario{

    private int horasTrabalhadas;

    private Double valorHoraTrabalhada;


    public Estagiario (String nome, String matricula, Double valorHoraTrabalhada, int horasTrabalhada){
        super(nome, matricula, 0.0);
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = 0;
    }

    // Método registrar horas
    public void registarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }


    // Método calcular salário
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada;
    }
}
