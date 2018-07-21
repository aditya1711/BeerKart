package pages;

import essentials.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/budget"})
public class Budget
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    request.getRequestDispatcher("budget.jsp").forward(request, response);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
	  User user = (User)request.getSession().getAttribute("user");
	  user.setBudget(request.getParameter("budget")); 
	  response.addCookie(new Cookie("budget", user.getBudget()));
	  
	  response.sendRedirect("advice");
  }
}
