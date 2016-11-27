public abstract class Medicamento {
	protected int codMedicamento;
	protected String nomeMed;
	protected Fabricante fabricante;
	protected Fornecedor fornecedor;
	protected Date validade;
	protected double preco;
	protected int qtdEstoque;
	protected String principioAtivo;

	public abstract int getQtdItem(int qtdEstoque);
}

public class MedSimples extends Medicamento {
	private Tarja tarja;

	public int getQtdItem(int qtdEstoque) {
		// Code
	}
}

public class MedComposto extends Medicamento {

	private List<Medicamento> componentes;

	public int getQtdItem(int qtdEstoque) {
		// Code
	}

	public boolean adicionaComponente(Medicamento medicamento) {
		// Code
	}

	public boolean removeComponente(Medicamento medicamento) {
		// Code
	}

	public List<Medicamento> listarComponentes() {
		// Code
	}

}

