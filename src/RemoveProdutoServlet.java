// Alunos
// 
// VINÍCIUS LOPES NUNES CB1640879
// JOÃO PEDRO TANACA RAMOS CB3002276


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeProduto")
public class RemoveProdutoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DB banco = new DB();
		String nome = request.getParameter("nome");
					
		banco.removeProduto(nome);
		response.sendRedirect("listaProdutos");
	}

}
