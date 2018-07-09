package pages;

import essentials.Expert;
import essentials.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/advice"})
public class Advice
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    User user = (User)request.getSession().getAttribute("user");
    request.setAttribute("advice", new Expert().getAdvice(user.getColor(), user.getBudget()));
    request.getRequestDispatcher("/advice.jsp").forward(request, response);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    doGet(request, response);
  }
}
