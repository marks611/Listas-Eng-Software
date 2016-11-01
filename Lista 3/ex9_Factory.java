public class Venda {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<int> quantidades;
    private Cliente cliente;
    private double porcentagemDesconto;
    private double preco;
    private ITipoPagamento tipoPagamento;

    public get...() { ... }
    public set...() { ... }
}

public interface ICriadorPagamento {
    public ITipoPagamento criarPagamento();
}

public class CriadorCartaoCredito implements ICriadorPagamento {
    public ITipoPagamento criarPagamento() {
        return new CartaoCredito();
    }
}

public class CriadorDinheiro implements ICriadorPagamento {
    public ITipoPagamento criarPagamento() {
        return new Dinheiro();
    }
}

public interface ITipoPagamento {
    public double getValor();
    public void setValor(double valor);
}

public class CartaoCredito implements ITipoPagamento {
    private double valor;

    public double getValor() { return valor * 0.95; }
    public void setValor(double valor) { this.valor = valor; }
}

public class Dinheiro implements ITipoPagamento {
    private double valor;

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}