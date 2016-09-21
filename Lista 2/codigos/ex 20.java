public class Usuario {
    public boolean obterPermissao(int nivelPermissao) {
        // CÓDIGO
    }
}

public class Gerente implements Usuario {
    String senha;
    int nivelPermissao;
    Usuario usuario;

    public boolean obterPermissao() {
        return usuario.obterPermissao(nivelPermissao);
    }
    
	// Getters e Setters//
}

public class Atendente implements Usuario {
    String senha;
    int nivelPermissao;
    Usuario usuario;

    public boolean obterPermissao() {
        return usuario.obterPermissao(nivelPermissao);
    }
    
	// Getters e Setters//
}

public class Dinheiro implements TipoPagamento {
    private TipoPagamento tipoPagamento;

    public BigDecimal calcularDesconto() {
        tipoPagamento.calcularDesconto(0.05f);
    }
    
	// Getters e Setters//
}

public class Cartao implements TipoPagamento {
    private TipoPagamento tipoPagamento;

    public BigDecimal calcularDesconto() {
        tipoPagamento.calcularDesconto(0f);
    }
    
	// Getters e Setters//
}

public class TipoPagamento {
    public BigDecimal calcularDesconto(float porcentagem) {
        // CÓDIGO
    }
}


