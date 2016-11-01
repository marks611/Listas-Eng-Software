public class Venda {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<int> quantidades;
    private Cliente cliente;
    private double porcentagemDesconto;
    private double preco;
    private String tipoPagamento;

    public get...() { ... }
    public set...() { ... }
}

public class VendaAssunto {
    private ArrayList<ObservadorVenda> observadores;
    private Venda venda;

    public void cadastrar(ObservadorVenda observador) {
        observadores.add(observador);
    }
    public void remover(int indice) {
        observadores.remove(indice);
    }
    public void notificar() {
        for (ObservadorVenda obs : observadores)
            obs.atualizar();
    }
}

public class VendaAssuntoConcreto extends VendaAssunto {
    private Venda venda;
    
    public Venda getVenda() { return venda; }
    public void setVenda(Venda venda) { this.venda = venda; }
}

public interface ObservadorVenda {
    public void atualizar();
}

public class ObservadorVendaConcreto implements ObservadorVenda {
    private Venda venda;
    private VendaAssuntoConcreto vac;

    @Override
    public void atualizar() {
        venda = vac.getVenda();
    }
}

public class ObservadorBD extends ObservadorVendaConcreto {
    @Override
    public void atualizar() {
        // atualiza o BD
    }
}

public class ObservadorForm extends ObservadorVendaConcreto {
    @Override
    public void atualizar() {
        // atualiza o form
    }
}
