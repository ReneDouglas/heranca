package modelos;

public class Tecnico extends Funcionario{

    private double adicionalCertificado = 200.00;
    private int qtdeCertificados;

    public Tecnico(String nome,
                   String matricula,
                   double salarioBase,
                   int qtdeCertificados) {
        super(nome, matricula, salarioBase);
        this.qtdeCertificados = qtdeCertificados;
    }

    @Override
    protected double calcularSalario() {
        return this.salarioBase + (this.adicionalCertificado * this.qtdeCertificados);
    }
}
