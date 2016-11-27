package Persistencia

import java.util.list;

public interface DAO<T> {
	public boolean inserir(object T);
	public boolean alterar(object T);
	public boolean excluir(object T);
	public T pesquisar(String filtro);
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
	public ClienteEspecial pesquisar(String filtro) {
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
	public Medicamento pesquisar(String filtro) {
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
	public Venda pesquisar(String filtro) {
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
	public Usuario pesquisar(String filtro) {
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
	public Caixa pesquisar(String filtro) {
		// Código
	}
}