package Persistencia;
import java.util.list;

public interface DAO<T> {
	public boolean inserir(T object);
	public boolean alterar(T object);
	public boolean excluir(T object);
	public T pesquisar(T object);
	public List<T> listar(String filtro);
}