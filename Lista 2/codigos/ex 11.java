public class Controle_Atualiza_Cliente {
    public Cliente_Especial buscarCliente() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public boolean validarCPF() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public void atualizaDados() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public Cliente_Especial obterCliente() {
        Cliente_Especial cliente = new Cliente_Especial();
        // Código para obter dados do cliente
        return cliente;
    }
}


public class Controle_Cadastro_Cliente {
    public boolean validarIdade() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public void cadastrarCliente() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public Cliente_Especial obterCliente() {
        Cliente_Especial cliente = new Cliente_Especial();
        // Código para obter dados do cliente
        return cliente;
    }
}


public class Controle_Estoque {
    public boolean validarMedicamento() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public void atualizarQuantidade() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public Medicamento obterMedicamento() {
        Medicamento medic = new Medicamento();
        // Código para obter dados do medicamento
        return medic;
    }
}

public class Controle_Cadastro_Medicamento {
    public void cadastrarMedicamento() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public boolean validarDadaValidade() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public Medicamento obterMedicamento() {
        Medicamento medic = new Medicamento();
        // Código para obter dados do medicamento
        return medic;
    }
}

public class Controle_Caixa {
    public Caixa abrirCaixa() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public void inserirDinheiro() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public void fecharCaixa() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public double contabilizarVendas() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public void exibirRelatorio() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public void exibirValorTotal() {
        Caixa caixa = ObterCaixa();;
        // CÓDIGO
    }
    public Caixa obterCaixa() {
        Caixa caixa = new Caixa();
        // Código para obter dados do caixa
        return caixa;
    }
}

public class Controle_Atualiza_Medicamento {
    public Medicamento buscarMedicamento() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public void atualizaDados() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public Medicamento obterMedicamento() {
        Medicamento medic = new Medicamento();
        // Código para obter dados do medicamento
        return medic;
    }
}

public class Controle_Venda_Medicamento {
    public Medicamento buscarMedicamento() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public boolean validarQtdMedicamento() {
        Venda venda = ObterVenda();;
        // CÓDIGO
    }
    public boolean verificarCliente() {
        Cliente_Especial cliente = ObterCliente();
        // CÓDIGO
    }
    public double calcularDesconto() {
        Venda venda = ObterVenda();;
        // CÓDIGO
    }
    public void efetuarPagamento() {
        Venda venda = ObterVenda();;
        // CÓDIGO
    }
    public void efetuarBaixaEstoque() {
        Medicamento medic = ObterMedicamento();;
        // CÓDIGO
    }
    public void emitirNotaFiscal() {
        Venda venda = ObterVenda();;
        // CÓDIGO
    }
    public Cliente_Especial obterCliente() {
        Cliente_Especial cliente = new Cliente_Especial();
        // Código para obter dados do cliente
        return cliente;
    }
    public Medicamento obterMedicamento() {
        Medicamento medic = new Medicamento();
        // Código para obter dados do medicamento
        return medic;
    }
    public Caixa obterCaixa() {
        Caixa caixa = new Caixa();
        // Código para obter dados do caixa
        return caixa;
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