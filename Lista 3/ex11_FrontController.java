public class Handler extends HttpServlet {
    protected void processarRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Command comando = null;
        
        try {
            comando = (Command)Class.forName("commands."+request.getParameter("command")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
       comando.execute(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}

public interface Command {
    public void execute(HttpServletRequest request, HttpServletResponse response);
}

public class ClienteCommand implements Command {
    ControleCliente control = new ControleCliente();
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String metodo = request.getParameter("metodo");
        switch (metodo) {
            case "buscar":
                response.getWriter().write(control.buscar((int)request.getParameter("cod")));
            case "validarCPF":
                response.getWriter().write(control.validarCPF(request.getParameter("cpf")));
            case "atualizar":
                control.atualizar((Cliente)request.getParameter("cliente"));
            case "cadastrar":
                control.cadastrar((Cliente)request.getParameter("cliente"));
            case "validarData":
                response.getWriter().write(control.validarData((Date)request.getParameter("data")));
        }
    }
}

public class VendaCommand implements Command {
    ControleVenda control = new ControleVenda();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        // processa a request...
    }
}

public class MedicamentoCommand implements Command {
    MedicamentoControle control = new MedicamentoControle();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        // processa a request...
    }
}

public class CaixaCommand implements Command {
    CaixaControle control = new CaixaControle();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        // processa a request...
    }
}

public class EstoqueCommand implements Command {
    EstoqueControle control = new EstoqueControle();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        // processa a request...
    }
}