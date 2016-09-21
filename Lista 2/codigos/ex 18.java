public interface TipoPagamento {
    public BigDecimal calcularDesconto();
}

public interface Usuario {
    public boolean obterPermissao();
}

public interface Cadastro {
    public void cadastrar();
    public boolean validar();
}

public class Venda {
	private List<Medicamento> medicamento;
	private List<int> quantidade;
	private Cliente_Especial cliente;
	private double porcentagemDesconto;
	private BigDecimal valor;
	private TipoPagamento tipoPagamento;

	// Getters e Setters//
}

public class Dinheiro implements TipoPagamento {
    public BigDecimal calcularDesconto() {

    }
    
	// Getters e Setters//
}

public class Cartao implements TipoPagamento {
    public BigDecimal calcularDesconto() {

    }
    
	// Getters e Setters//
}

public class Gerente implements Usuario {
    String senha;
    int nivelPermissao;

    public boolean obterPermissao() {

    }
    
	// Getters e Setters//
}

public class Atendente {
    String senha;
    int nivelPermissao;

    public boolean obterPermissao() {

    }
    
	// Getters e Setters//
}

public class Controle_Caixa {
    Usuario usuario;
    
    public Caixa abrirCaixa(Caixa caixa) {
        // CÓDIGO
    }
    public boolean validarUsuario() {
        // CÓDIGO
    }
    public void inserirDinheiro(Caixa caixa) {
        // CÓDIGO
    }
    public void fecharCaixa(Caixa caixa) {
        // CÓDIGO
    }
    public double contabilizarVendas(Caixa caixa) {
        // CÓDIGO
    }
    public void exibirRelatorio(Caixa caixa) {
        // CÓDIGO
    }
    public void exibirValorTotal(Caixa caixa) {
        // CÓDIGO
    }
}

public class Controle_Cadastro_Medicamento implements Cadastro {
    public void cadastrar() {
        // CÓDIGO
    }
    public boolean validar() {
        // CÓDIGO
    }
}

public class Controle_Cadastro_Cliente implements Cadastro {
    public boolean validar() {
        // CÓDIGO
    }
    public void cadastrar() {
        // CÓDIGO
    }
}

public class Formulario_CadastraMedicamento {
    private Cadastro cadastro;
}

public class Formulario_CadastroCliente {
    private Cadastro cadastro;
}