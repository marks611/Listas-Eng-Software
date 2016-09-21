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