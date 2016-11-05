// Pacote Enum

package Enum;
public enum TipoPagamento {
    // Code
}

public enum TipoUsuario {
    // Code
}

// Pacote Caixa

package caixa;
public class Caixa {
    // Code
}

public class Facade implements IFacade{
    private Caixa caixa;
    private Moedas moedas;
    private Notas notas;
    // Code
}

public interface IFacade {
    // Code
}

public class Moedas {
    // Code
}

public class Notas {
    // Code
}

// Pacote Cliente

package cliente;
public class ClienteEspecial {
    // Code
}

public class Facade implements IFacade {
    private ClienteEspecial clienteEspecial;
    // Code
}

public interface IFacade {
    // Code
}

// Pacote Controller

package controller;
public class ControleCaixa {
    // Code
}

public class ControleCliente {
    // Code
}

public class ControleEstoque {
    // Code
}

public class ControleMedicamento {
    // Code
}

public class ControleVenda {
    // Code
}

public class Facade implements IFacade {
    private ControleCaixa controleCaixa;
    private ControleCliente controleCliente;
    private ControleEstoque controleEstoque;
    private ControleMedicamento controleMedicamento;
    private ControleVenda controleVenda;
    // Code
}

public interface IFacade {
    // Code
}

// Pacote Medicamento

package medicamento;
public class Facade implements IFacade {
    private Medicamento medicamento;
    // Code
}

public interface IFacade {
    // Code
}

public class Medicamento {
    // Code
}

// Pacote Persistencia

package persistencia;
public class CaixaDAO implements DAO<caixa.Caixa> {
    // Code
}

public class ClienteEspecialDAO implements DAO<cliente.ClienteEspecial> {
    //Code
}

public interface DAO<T> {
    // Code
}

public class MedicamentoDAO implements DAO<medicamento.Medicamento> {
    // Code
}

public class MoedasDAO implements DAO<caixa.Moedas> {
    // Code
}

public class NotasDAO implements DAO<caixa.Notas> {
    // Code
}

public class UsuarioDAO implements DAO<usuario.Usuario> {
    // Code
}

public class VendaDAO implements DAO<venda.Venda> {
    // Code
}

// Pacote Usuario

package usuario;
public class Facade implements IFacade {
    private Usuario usuario;
	// Code
}

package usuario;
public interface IFacade {
    // Code
}

package usuario;
public class Usuario {
    // Code
}

// Pacote Venda

package venda;
public class Facade implements IFacade {
    private Venda venda;
    // Code
}

public interface IFacade {
    // Code
}

public class Venda {
    // Code
}

// Pacote View

package view;
public interface FormularioCaixaAbertura {
    // Code
}

public interface FormularioCaixaFechamento {
    // Code
}

public interface FormularioCliente {
    // Code
}

public interface FormularioControleEstoque {
    // Code
}

public interface FormularioMedicamento {
    // Code
}

public interface FormularioVendaMedicamento {
    // Code
}
