
public class Main {

    public static void main(String[] args) {

        MotoristaIniciante iniciante =
                new MotoristaIniciante("Artur", "ABC1234");

        MotoristaPremium premium =
                new MotoristaPremium("Ana", "DEF5678");

        MotoristaParceiroFrotista frotista =
                new MotoristaParceiroFrotista("Francisco", "GHI9012");

        iniciante.registrarCorrida(100);
        iniciante.registrarCorrida(150);

        premium.registrarCorrida(100);
        premium.registrarCorrida(200);

        frotista.registrarCorrida(500);
        frotista.registrarCorrida(600);

        imprimirExtrato(iniciante);
        imprimirExtrato(premium);
        imprimirExtrato(frotista);
    }

    public static void imprimirExtrato(Motorista motorista) {
        System.out.println("\nNome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlaca());
        System.out.println(
                "Corridas: " + motorista.getQuantidadeCorridas()
        );
        System.out.println("Valor bruto: R$ " + motorista.getValorBruto());
        System.out.println(
                "Valor líquido: R$ " + motorista.calcularPagamentoLiquido()
        );
        System.out.println("------------------------");
    }
}
