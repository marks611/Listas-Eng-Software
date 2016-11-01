public class Venda {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<int> quantidades;
    private Cliente cliente;
    private double porcentagemDesconto;
    private double preco;
    private IPagamento pagamento;

    public get...() { ... }
    public set...() { ... }
}

public interface IPagamento {
    public double GetValorPagamento();
    public CompositePagamento GetCompositePagamento();
}

public class CompositePagamento implements IPagamento {
    private ArrayList<IPagamento> pagamentos;

    public boolean RemovePagamento(IPagamento pag) {
        pagamentos.remove(pag);
    }
    public void AddPagamento(IPagamento pag) {
        pagamentos.add(pag);
    }
    public double GetValorPagamento() {
        double valor = 0;
        for (IPagamento pag : pagamentos)
            valor += pag.GetValorPagamento();
        return valor;
    }
    public CompositePagamento GetCompositePagamento() {
        return this;
    }
    public IPagamento GetPagamento(int index) {
        // realiza percurso em pré-ordem e retorna o IPagamento no índice indicado
    }
}

public class Cheque implements IPagamento {
    private double valor;

    public double GetValorPagamento() {
        return valor;
    }
    public CompositePagamento GetCompositePagamento() {
        return null;
    }
}

public class Dinheiro implements IPagamento {
    private double valor;

    public double GetValorPagamento() {
        return valor;
    }
    public CompositePagamento GetCompositePagamento() {
        return null;
    }
}

public class Cartao implements IPagamento {
    private double valor;

    public double GetValorPagamento() {
        return valor;
    }
    public CompositePagamento GetCompositePagamento() {
        return null;
    }
}
