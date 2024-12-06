import modelos.*;


public class Main {
    public static void main(String[] args) {

        Funcionario dev = new Desenvolvedor(
                "Rafael",
                "123",
                1000,
                10);

        dev.exibirInformacoes();

        Funcionario gerente = new Gerente(
                "Igor",
                "321",
                1000,
                1500);

        gerente.exibirInformacoes();

        Funcionario analista = new Analista(
                "Ana",
                "222",
                1000,
                15);

        analista.exibirInformacoes();

        Funcionario tecnico = new Tecnico("Lucas",
                "3333",
                1000,
                8);

        tecnico.exibirInformacoes();


    }


}