public class Venda {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<int> quantidades;
    private Cliente cliente;
    private double porcentagemDesconto;
    private double preco;
    private ITipoPagamento tipoPagamento;

    public get...() { ... }
    public set...() { ... }
    public void selecionarTipoPagamento(ITipoPagamento tipo) {
        tipoPagamento = tipo;
    }
}

public interface ITipoPagamento {
    public void selecionarTipoPagamento(ITipoPagamento tipo);
}

public class Dinheiro implements ITipoPagamento {
    private double valor;

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}

public class CartaoCredito implements ITipoPagamento {
    private double valor;

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
