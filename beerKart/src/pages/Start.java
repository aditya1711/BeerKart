package pages;

import essentials.User;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/start"})
public class Start
  extends HttpServlet
{
  private User user;
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Cookie[] cookies = request.getCookies();
    User u = (User)request.getSession().getAttribute("user");
    if (cookies != null) {
      for (int i = 0; i < cookies.length; i++) {
        if (cookies[i].getName().equals("username"))
        {
          u.setUsername(cookies[i].getValue());
        }
        else if (cookies[i].getName().equals("color"))
        {
          u.setColor(cookies[i].getValue());
          System.out.println("found cookie color " + cookies[i].getValue());
        }
        else if (cookies[i].getName().equals("budget"))
        {
          u.setBudget(cookies[i].getValue());
          System.out.println("found cookie budget " + cookies[i].getValue());
        }
      }
    }
    request.getSession().setAttribute("user", u);
    request.setAttribute("username", u.getUsername());
    request.setAttribute("color", u.getColor());
    request.setAttribute("budget", u.getBudget());
    request.getRequestDispatcher("/start.jsp").forward(request, response);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    doGet(request, response);
  }
}
