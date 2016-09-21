public class Controle_Atualiza_Cliente {
    public Cliente_Especial buscarCliente() {
        // CÓDIGO
    }
    public boolean validarCPF(Cliente_Especial cliente) {
        // CÓDIGO
    }
    public void atualizaDados(Cliente_Especial cliente) {
        // CÓDIGO
    }
}

public class Controle_Cadastro_Cliente {
    public boolean validarIdade(Cliente_Especial cliente) {
        // CÓDIGO
    }
    public void cadastrarCliente(Cliente_Especial cliente) {
        // CÓDIGO
    }
}

public class Controle_Estoque {
    public boolean validarMedicamento(Medicamento medic) {
        // CÓDIGO
    }
    public void atualizarQuantidade(Medicamento medic) {
        // CÓDIGO
    }
}

public class Controle_Cadastro_Medicamento {
    public void cadastrarMedicamento(Medicamento medic) {
        // CÓDIGO
    }
    public boolean validarDadaValidade(Medicamento medic) {
        // CÓDIGO
    }
}

public class Controle_Caixa {
    public Caixa abrirCaixa(Caixa caixa) {
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

public class Controle_Atualiza_Medicamento {
    public Medicamento buscarMedicamento() {
        // CÓDIGO
    }
    public void atualizaDados(Medicamento medic) {
        // CÓDIGO
    }
}

public class Controle_Venda_Medicamento {
    public Medicamento buscarMedicamento() {
        // CÓDIGO
    }
    public boolean validarQtdMedicamento(Venda venda) {
        // CÓDIGO
    }
    public boolean verificarCliente(Cliente_Especial cliente) {
        // CÓDIGO
    }
    public double calcularDesconto(Venda venda) {
        // CÓDIGO
    }
    public void efetuarPagamento(Venda venda) {
        // CÓDIGO
    }
    public void efetuarBaixaEstoque(Medicamento medic, int qtd) {
        // CÓDIGO
    }
    public void emitirNotaFiscal(Venda venda) {
        // CÓDIGO
    }
}


public class Cliente_Especial {
	private String nome, rg, endereco;
	private int telefone;
	private long cpf;
	private Date dataNascimento;
	private List<Venda> vendas;

	// Getters e Setters//
}

public class Medicamento {
	private String nome, fabricante;
	private Date dataValidade;
	private BigDecimal preco;
	private int qtdEstoque;

	// Getters e Setters //
}

public class Venda {
	private List<Medicamento> medicamento;
	private List<int> quantidade;
	private Cliente_Especial cliente;
	private double porcentagemDesconto;
	private BigDecimal valor;
	private Tipo_Pagamento tipoPagamento;

	// Getters e Setters//
}

public class Caixa {
	private String senhaAbertura, senhaFechamento;
	private Notas notas;
	private Moedas moedas;

	// Getters e Setters//
}

public class Notas {
    private int qtdDoisReais, qtdCincoReais, qtdDezReais,
		qtdVinteReais, qtdCinquentaReais, qtdCemReais;

    // Getters e Setters//
}

public class Moedas {
    private int qtdCincoCentavos, qtdDezCentavos,
		qtdVinteCincoCentavos, qtdCinquentaCentavos, qtdUmReal;

    // Getters e Setters//
}