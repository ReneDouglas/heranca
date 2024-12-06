package modelos;

public class Gerente extends Funcionario{

    private double adicional;

    public Gerente(String nome, String matricula, double salarioBase, double adicional) {
        super(nome, matricula, salarioBase);
        this.adicional = adicional;
    }

    @Override
    protected double calcularSalario() {
        return this.salarioBase + this.adicional;
    }

}
