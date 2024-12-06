package modelos;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario {

    private final int VALOR_HORA_EXTRA = 50;
    private int horasExtras;



    public Desenvolvedor(String nome, String matricula, double salarioBase, int qtdeHoras) {
        super(nome, matricula, salarioBase);
        this.horasExtras = qtdeHoras;
    }

    @Override
    protected double calcularSalario() {
        return this.salarioBase + (VALOR_HORA_EXTRA * this.horasExtras);
    }

}
