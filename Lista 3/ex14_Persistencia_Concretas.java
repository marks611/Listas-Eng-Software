package Persistencia

import java.util.list;
public interface DAO<T> {
	public boolean inserir(T object);
	public boolean alterar(T object);
	public boolean excluir(T object);
	public T pesquisar(T object);
	public List<T> listar(String filtro);
}

public class ClienteEspecialDAO implements DAO<ClienteEspecial> {
	@Override
	public boolean inserir(ClienteEspecial cliente) {
		// Código
	}
	@Override
	public boolean alterar(ClienteEspecial cliente) {
		// Código
	}
	@Override
	public boolean excluir(ClienteEspecial cliente) {
		// Código
	}
	@Override
	public ClienteEspecial pesquisar(CLienteEspecial cliente) {
		// Código
	}
}

public class MedicamentoDAO implements DAO<Medicamento> {
	@Override
	public boolean inserir(Medicamento medic) {
		// Código
	}
	@Override
	public boolean alterar(Medicamento medic) {
		// Código
	}
	@Override
	public boolean excluir(Medicamento medic) {
		// Código
	}
	@Override
	public Medicamento pesquisar(Medicamento medic) {
		// Código
	}
}

public class VendaDAO implements DAO<Venda> {
	@Override
	public boolean inserir(Venda venda) {
		// Código
	}
	@Override
	public boolean alterar(Venda venda) {
		// Código
	}
	@Override
	public boolean excluir(Venda venda) {
		// Código
	}
	@Override
	public Venda pesquisar(Venda venda) {
		// Código
	}
}

public class UsuarioDAO implements DAO<Usuario> {
	public boolean inserir(Usuario usuario) {
		// Código
	}
	@Override
	public boolean alterar(Usuario usuario) {
		// Código
	}
	@Override
	public boolean excluir(Usuario usuario) {
		// Código
	}
	@Override
	public Usuario pesquisar(Usuario usuario) {
		// Código
	}
}

public class CaixaDAO implements DAO<Caixa> {
	public boolean inserir(Caixa caixa) {
		// Código
	}
	@Override
	public boolean alterar(Caixa caixa) {
		// Código
	}
	@Override
	public boolean excluir(Caixa caixa) {
		// Código
	}
	@Override
	public Caixa pesquisar(Caixa caixa) {
		// Código
	}
}

public class MoedasDAO implements DAO<Moedas> {
	public boolean inserir(Moedas moedas) {
		// Código
	}
	@Override
	public boolean alterar(Moedas moedas) {
		// Código
	}
	@Override
	public boolean excluir(Moedas moedas) {
		// Código
	}
	@Override
	public Moedas pesquisar(Moedas moedas) {
		// Código
	}
}

public class NotasDAO implements DAO<Notas> {
	@Override
	public boolean inserir(Notas notas) {
		// Código
	}
	@Override
	public boolean alterar(Notas notas) {
		// Código
	}
	@Override
	public boolean excluir(Notas notas) {
		// Código
	}
	@Override
	public Notas pesquisar(Notas notas) {
		// Código
	}
}