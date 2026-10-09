
public class MotoristaPremium extends Motorista {

    public MotoristaPremium(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor);
        adicionarAoValorBruto(2);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBruto() * 0.85;
    }
}
