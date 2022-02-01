

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cart")
public class cart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String cartRetrieved = (String) session.getAttribute("cart");
		
		response.setContentType("text/html");   
	      PrintWriter out = response.getWriter();   
	      out.print("<html><body>");   
	      out.print("<h3>" + cartRetrieved + "</h3>");   
	      out.print("</body></html>");     
	}


}
