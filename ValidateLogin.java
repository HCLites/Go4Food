

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDAO;
import entity.Customer;

@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		CustomerDAO cdao = new CustomerDAO();
		Customer cust = cdao.findCustomer(username);
		
		System.out.println(cust.getFirst_name());
		
		
	}

}
