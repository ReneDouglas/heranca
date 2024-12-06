package modelos;

public class Analista extends Funcionario{

    private double valorPorProjeto = 500.00;
    private int qtdeProjetos;


    public Analista(String nome,
                    String matricula,
                    double salarioBase,
                    int qtdeProjetos) {
        super(nome, matricula, salarioBase);
        this.qtdeProjetos = qtdeProjetos;
    }

    @Override
    protected double calcularSalario() {
        return this.salarioBase + (this.qtdeProjetos * this.valorPorProjeto);
    }
}
