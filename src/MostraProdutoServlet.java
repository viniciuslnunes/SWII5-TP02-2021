// Alunos
// 
// VINÍCIUS LOPES NUNES CB1640879
// JOÃO PEDRO TANACA RAMOS CB3002276

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");

		DB banco = new DB();
		Produto produto = banco.buscaProdutoNome(nome);
		
		request.setAttribute("produto", produto);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);
		
		
	}
}
