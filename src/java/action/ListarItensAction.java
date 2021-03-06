package action;

import controller.Action;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.ProdutoDAO;

public class ListarItensAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer idRestaurante = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("idRest", idRestaurante);
        request.setAttribute("produtos", ProdutoDAO.getInstance().listAllFromRestaurante(idRestaurante));
        RequestDispatcher dispatcher = request.getRequestDispatcher("acesso-restrito-superusuario-listar-produtos.jsp");
        dispatcher.forward(request, response);
    }

}
