
public class MotoristaParceiroFrotista extends Motorista {

    public MotoristaParceiroFrotista(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento = getValorBruto() * 0.80;
        pagamento -= 800;

        if (pagamento < 0) {
            pagamento = 0;
        }

        return pagamento;
    }
}
