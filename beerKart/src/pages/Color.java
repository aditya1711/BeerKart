package pages;

import essentials.User;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/color"})
public class Color
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    User user = (User)request.getSession().getAttribute("user");
    System.out.println("entered color on form page: " + request.getParameter("color"));
    user.setColor(request.getParameter("color"));
    
    response.addCookie(new Cookie("color", user.getColor()));
    
    response.sendRedirect("budget.jsp");
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    doGet(request, response);
  }
}
