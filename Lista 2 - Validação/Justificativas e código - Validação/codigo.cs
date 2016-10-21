========================================== 7 ==========================================

public class Atendente : Usuario
{
	public float comissao { get; set; }

	public void obterSenha() {} {}
}

public class Caixa
{
	public Currency totalCaixa { get; set; }

	public string senha { get; set; }

	public Nota qtdNotas { get; set; }

	public Moeda qtdMoedas { get; set; }

	public Usuario usuarioAbriu { get; set; }

	public Usuario usuarioFechou { get; set; }

	public ICollection<Nota> nota { get; set; }

	public ICollection<Venda> venda { get; set; }

	public ICollection<Moeda> moeda { get; set; }

	public void obterCaixa() {}

	public void definirCaixa() {}
}

public class Cartao : Pagamento
{
	public int codigoCartao { get; set; }

	public string bandeiraCartao { get; set; }

	public void obterPagamento() {}
}

public class Cliente
{
	public string nome { get; set; }

	public string telefone { get; set; }

	public string cpf { get; set; }

	public string endereco { get; set; }

	public static int qtdClientes { get; set; }

	public Date dataNascimento { get; set; }

	public void obterCliente() {}

	public void definirCliente() {}

	public static void obterQtdClientes() {}
}

public class Dinheiro : Pagamento
{
	public float porcentagemDesconto { get; set; }

	public void obterPagamento() {}
}

public class Estoque
{
	public int qtdEstoque { get; set; }

	public static int capidadeMaxima { get; set; }

	public ICollection<Medicamento> medicamento { get; set; }

	public void obterEstoque() {}

	public void definirEstoque() {}

	public static void definirMaxEstoque() {}
}

public class Gerente : Usuario
{
	public int descontoAtribuido { get; set; }

	public void atribuirDesconto() {}

	public void obterSenha() {}
}

public class Medicamento
{
	public int codigo { get; set; }

	public string nome { get; set; }

	public string fabricante { get; set; }

	public Date prazoValidade { get; set; }

	public Currency preco { get; set; }

	public Tarja corTarja { get; set; }

	public Estoque estoque { get; set; }

	public void obterMedicamento() {}

	public void definirMedicamento() {}
}

public class Moeda
{
	public int qtd { get; set; }

	public Emoeda tipo { get; set; }

	public Caixa caixa { get; set; }

	public void obterMoeda() {}

	public void definirMoeda() {}
}

public class Nota
{
	public int qtd { get; set; }

	public Enota tipo { get; set; }

	public void obterNota() {}

	public void obterNota() {}
}

public class Pagamento
{
	public int porcentagemDesconto { get; set; }

	public Currency valorPago { get; set; }

	public abstract void obterPagamento();

	public void definirPagamento(Venda venda)
}

public class Usuario
{
	public string login { get; set; }

	public string senha { get; set; }

	public void obterUsuario() {}

	public void definirUsuario() {}

	public abstract void obterSenha();
}

public class Venda
{
	public Currency valorVenda { get; set; }

	public float porcentagemDesconto { get; set; }

	public Usuario usuarioResponsavel { get; set; }

	public ICollection<Pagamento> pagamento { get; set; }

	public ICollection<Medicamento> medicamento { get; set; }

	public Cliente cliente { get; set; }

	public Usuario usuario { get; set; }

	public void obterVenda() {}

	public void definirVenda() {}
}

========================================== 9 ==========================================

public class ControleCaixa
{
	public void abrirCaixa() {}

	public void fecharCaixa(Caixa caixaFechado) {}

	public void contabilizarVendas() {}

	public void validarSenha() {}

	public void montarRelatorio() {}

	public void inserirNotas() {}

	public void inserirMoedas() {}
}

public class ControleCliente
{
	public Boolean validarIdade() {}

	public void salvarCliente() {}

	public boolean validarCpf(String in Cpf) {}

	public void atualizarCliente(Cliente cliente) {}
}

public class ControleEstoque
{
	public void removerMedicamento(int in codigoMedicamento, int in quantidade) {}

	public void inserirMedicamento(int in codigoMeciamento, int in quantidade) {}

	public void atualizaEstoque(Estoque estoque) {}

	public void baixaEstoque() {}
}

public class ControleMedicamento
{
	public void cadastrarMedicamento() {}

	public boolean validarVencimento(Date dataVencimento) {}

	public void atualizaMedicamento(Medicamento medicamento) {}

	public void buscaMedicamento() {}
}

public class ControleVenda
{
	public void calculaValorCompra() {}

	public void vender(Venda venda) {}

	public void consultaVendas() {}

	public void obterInformacoesCartao() {}

	public void gerarNotaFiscal() {}
}

========================================== 11 ==========================================

public class ControleCaixa
{
	public void abrirCaixa()
	{
		var caixa = new Caixa();
	}

	public void fecharCaixa(Caixa caixaFechado) {}

	public void contabilizarVendas()
	{
		var caixa = new Caixa();
	}

	public void validarSenha()
	{
		var caixa = new Caixa();
	}

	public void montarRelatorio()
	{
		var caixa = new Caixa();
	}

	public void inserirNotas()
	{
		var caixa = new Caixa();
	}

	public void inserirMoedas()
	{
		var caixa = new Caixa();
	}
}

public class ControleCliente
{
	public Boolean validarIdade()
	{
		var cliente = new Cliente();
	}

	public void salvarCliente()
	{
		var cliente = new Cliente();
	}

	public boolean validarCpf(String in Cpf)
	{
		var cliente = new Cliente();
	}

	public void atualizarCliente(Cliente cliente) {}
}

public class ControleEstoque
{
	public void removerMedicamento(int in codigoMedicamento, int in quantidade)
	{
		var medicamento = new Medicamento();
	}

	public void inserirMedicamento(int in codigoMeciamento, int in quantidade)
	{
		var medicamento = new Medicamento();
	}

	public void atualizaEstoque(Estoque estoque)
	{
		var medicamento = new Medicamento();
	}

	public void baixaEstoque()
	{
		var medicamento = new Medicamento();
	}

	public Estoque verificarEstoque(Medicamento medicamento)
	{
		var medicamento = new Medicamento();
	}
}

public class ControleMedicamento
{
	public void cadastrarMedicamento()
	{
		var medicamento = new Medicamento();
	}

	public boolean validarVencimento(Date dataVencimento)
	{
		var medicamento = new Medicamento();
	}

	public void atualizaMedicamento(Medicamento medicamento)
	{
		var medicamento = new Medicamento();
	}

	public void buscaMedicamento()
	{
		var medicamento = new Medicamento();
	}
}

public class ControleVenda
{
	public void calculaValorCompra()
	{
		var medicamento = new Medicamento();
	}

	public void vender(Venda venda) {}

	public void consultaVendas() {}

	public void obterInformacoesCartao()
	{
		var cliente = new Cliente();
	}

	public void gerarNotaFiscal()
	{
		var usuario = new Usuario();
	}
}

========================================== 13 ==========================================

public class Estoque
{
	public int qtdEstoque { get; set; }

	public static int capidadeMaxima { get; set; }

	public List<Medicamento> medicamento { get; set; }

	public void obterEstoque() {}

	public void definirEstoque() {}

	public static void definirMaxEstoque() {}
}

public class Medicamento
{
	public int codigo { get; set; }

	public string nome { get; set; }

	public string fabricante { get; set; }

	public Date prazoValidade { get; set; }

	public Currency preco { get; set; }

	public Tarja corTarja { get; set; }

	public Estoque estoque { get; set; }

	public void obterMedicamento() {}

	public void definirMedicamento() {}
}

public class Venda
{
	public Currency valorVenda { get; set; }

	public float porcentagemDesconto { get; set; }

	public Usuario usuarioResponsavel { get; set; }

	public List<Pagamento> pagamento { get; set; }

	public List<Medicamento> medicamento { get; set; }

	public Cliente cliente { get; set; }

	public Usuario usuario { get; set; }

	public void obterVenda() {}

	public void definirVenda() {}
}

public class Pagamento
{
	public int porcentagemDesconto { get; set; }

	public Currency valorPago { get; set; }

	public abstract void obterPagamento();

	public void definirPagamento(Venda venda)
}

public class Caixa
{
	public Currency totalCaixa { get; set; }

	public string senha { get; set; }

	public Nota qtdNotas { get; set; }

	public Moeda qtdMoedas { get; set; }

	public Usuario usuarioAbriu { get; set; }

	public Usuario usuarioFechou { get; set; }

	public List<Nota> nota { get; set; }

	public List<Venda> venda { get; set; }

	public List<Moeda> moeda { get; set; }

	public void obterCaixa() {}

	public void definirCaixa() {}
}

public class Moeda
{
	public int qtd { get; set; }

	public Emoeda tipo { get; set; }

	public Caixa caixa { get; set; }

	public void obterMoeda() {}

	public void definirMoeda() {}
}

public class Nota
{
	public int qtd { get; set; }

	public Enota tipo { get; set; }

	public void obterNota() {}

	public void obterNota() {}
}

public class Usuario
{
	public string login { get; set; }

	public string senha { get; set; }

	public void obterUsuario() {}

	public void definirUsuario() {}

	public abstract void obterSenha();
}

========================================== 15 ==========================================

public class Estoque
{
	public int qtdEstoque { get; set; }

	public static int capidadeMaxima { get; set; }

	public HashSet<Medicamento> medicamento { get; set; }

	public void obterEstoque() {}

	public void definirEstoque() {}

	public static void definirMaxEstoque() {}
}

public class Medicamento
{
	public int codigo { get; set; }

	public string nome { get; set; }

	public string fabricante { get; set; }

	public Date prazoValidade { get; set; }

	public Currency preco { get; set; }

	public Tarja corTarja { get; set; }

	public Estoque estoque { get; set; }

	public void obterMedicamento() {}

	public void definirMedicamento() {}
}

public class Venda
{
	public Currency valorVenda { get; set; }

	public float porcentagemDesconto { get; set; }

	public Usuario usuarioResponsavel { get; set; }

	public HashSet<Pagamento> pagamento { get; set; }

	public HashSet<Medicamento> medicamento { get; set; }

	public Cliente cliente { get; set; }

	public Usuario usuario { get; set; }

	public void obterVenda() {}

	public void definirVenda() {}
}

public class Pagamento
{
	public int porcentagemDesconto { get; set; }

	public Currency valorPago { get; set; }

	public abstract void obterPagamento();

	public void definirPagamento(Venda venda)
}

public class Caixa
{
	public Currency totalCaixa { get; set; }

	public string senha { get; set; }

	public Nota qtdNotas { get; set; }

	public Moeda qtdMoedas { get; set; }

	public Usuario usuarioAbriu { get; set; }

	public Usuario usuarioFechou { get; set; }

	public HashSet<Nota> nota { get; set; }

	public HashSet<Venda> venda { get; set; }

	public HashSet<Moeda> moeda { get; set; }

	public void obterCaixa() {}

	public void definirCaixa() {}
}

public class Moeda
{
	public int qtd { get; set; }

	public Emoeda tipo { get; set; }

	public Caixa caixa { get; set; }

	public void obterMoeda() {}

	public void definirMoeda() {}
}

public class Nota
{
	public int qtd { get; set; }

	public Enota tipo { get; set; }

	public void obterNota() {}

	public void obterNota() {}
}

public class Usuario
{
	public string login { get; set; }

	public string senha { get; set; }

	public void obterUsuario() {}

	public void definirUsuario() {}

	public abstract void obterSenha();
}

========================================== 18 ==========================================
==================== a ====================

public class ControleEstoque : IEstoque
{
	public void removerMedicamento(int codigoMedicamento, int quantidade) {}

	public void inserirMedicamento(int codigoMedicamento, int quantidade) {}

	public void atualizaEstoque(Estoque estoque) {}

	public Estoque verificarEstoque(Medicamento medicamento) {}

	public void baixaEstoque() {}
}

public interface IEstoque
{
	void atualizaEstoque(Estoque estoque);

	void removerMedicamento(int codigoMedicamento, int quantidade);

	Estoque verificarEstoque(Medicamento medicamento);

}

public class Venda
{
	private Currency valorVenda{ get; set; }

	private Medicamento medicamento{ get; set; }

	private Cliente cliente{ get; set; }

	private float porcentagemDesconto{ get; set; }

	private Pagamento formaPagamento{ get; set; }

	private Usuario usuarioResponsavel{ get; set; }

	private IEstoque iEstoque{ get; set; }

	public void obterVenda() {}

	public void definirVenda() {}
}

==================== b ====================

public class ControleCaixa
{
	private IVenda iVenda{ get; set; }

	public Caixa abrirCaixa() {}

	public void fecharCaixa(Caixa caixaFechado) {}

	public void contabilizarVendas() {}

	public void validarSenha() {}

	public void montarRelatorio() {}

	public void inserirNotas() {}

	public void inserirMoedas() {}
}

public interface IVenda
{
	Venda obterHistorico();

	void consultaVendas();
}

public class ControleVenda : IVenda
{
	public void calculaValorCompra() {}

	public void vender(Venda venda) {}

	public void consultaVendas() {}

	public void obterInformacoesCartao() {}

	public void gerarNotaFiscal() {}

	public Venda obterHistorico() {}
}

==================== c ====================

public class ControleCliente : IValidacaoCliente
{
	public boolean validarIdade() {}

	public void salvarcliente() {}

	public Cliente validarCpf(String cpf) {}

	public void atualizarCliente(Cliente cliente) {}
}

public interface IValidacaoCliente
{
	boolean validarIdade();

	Cliente validarCpf(String cpf);
}

public class Venda
{
	private Currency valorVenda{ get; set; }

	private Medicamento medicamento{ get; set; }

	private Cliente cliente{ get; set; }

	private float porcentagemDesconto{ get; set; }

	private Pagamento formaPagamento{ get; set; }

	private Usuario usuarioResponsavel{ get; set; }

	private IValidacaoCliente iValidacaoCliente{ get; set; }

	public void obterVenda() {}

	public void definirVenda() {}
}

========================================== 20 ==========================================

public class Cartao
{
	private int codigoCartao{ get; set; }

	private String bandeiraCartao{ get; set; }

	public void obterPagamento() {}
}

public class Pagamento
{
	private int porcentagemDesconto{ get; set; }

	private Currency valorPago{ get; set; }

	private Pagamento pagamento = new Pagamento();

	public void obterPagamento() {}
	{
		pagamento.obterPagamento();
	}

	public void definirPagamento() {}
}

public class Dinheiro : Pagamento
{
	private int porcentagemDesconto{ get; set; }

	public void obterPagamento() {}
}

public class Medicamento
{
	private String nome{ get; set; }

	private String fabricante{ get; set; }

	private String prazoValidade{ get; set; }

	private Currency preco{ get; set; }

	private int codigo{ get; set; }

	private enumTarja tarja{ get; set; }

	public void addReceita(Receita receita)
	{
		receita.addRetida(new Retida());
		// ou
		receita.addNaoRetida(new NaoRetida());
	}

	public void removerReceita(Receita receita)
	{
		receita.removerRetida(new Retida());
		// ou
		receita.removerNaoRetida(new NaoRetida());
	}
}

public class Receita
{
	private Date validade{ get; set; }

	private String prescritor{ get; set; }

	public void addRetida(Retida retida) {}

	public void removerRetida(Retida retida) {}

	public void addNaoRetida(NaoRetida naoRetida) {}

	public void removerNaoRetida(NaoRetida naoRetida) {}
}

public class Retida
{
	private int codigoRetencao{ get; set; }
}

public class NaoRetida
{
	private Date dataReceita{ get; set; }
}
