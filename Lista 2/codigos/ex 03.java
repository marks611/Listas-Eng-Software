//TIPO PAGAMENTO//
public abstract class Tipo_Pagamento{
    private String tipo;
    //Getter e Setter//
    public abstract BigDecimal calcularDesconto(BigDecimal valor);
}

public class Dinheiro extends Tipo_Pagamento{
    @Override
    public BigDecimal calcularDesconto(BigDecimal valor){
        //CODIGO
    }
}

public class Cartao extends Tipo_Pagamento{
    @Override
    public BigDecimal calcularDesconto(BigDecimal valor){
        //CODIGO
    }
}

//USUÁRIO//
public abstract class Usuario{
    private String tipo;
    //Getter e Setter//
    public abstract void obterPermissao();
}

public class Gerente extends Usuario{
    @Override
    public void obterPermissao(){
        //CODIGO
    }
}

public class Atendente extends Usuario{
    @Override
    public void obterPermissao(){
        //CODIGO
    }
}