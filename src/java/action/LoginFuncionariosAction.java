package action;

import controller.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFuncionariosAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendRedirect("form-login-funcionarios.jsp");
    }
    
}
