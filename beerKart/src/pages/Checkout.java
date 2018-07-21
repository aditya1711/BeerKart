package pages;

import essentials.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/checkout"})
public class Checkout
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    User user = (User)request.getSession().getAttribute("user");
    user.setUsername(request.getParameter("username"));
    response.addCookie(new Cookie("username", user.getUsername()));
    request.setAttribute("username", request.getParameter("username"));
    request.getRequestDispatcher("bye.jsp").include(request, response);
    System.out.println("back to checkout servlet after dispatch to bye.jsp");
    request.getSession().invalidate();
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    doGet(request, response);
  }
}
