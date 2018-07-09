package pages;

import essentials.User;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener
  implements HttpSessionListener
{
  public void sessionCreated(HttpSessionEvent arg0)
  {
    arg0.getSession().setAttribute("user", new User());
  }
  
  public void sessionDestroyed(HttpSessionEvent arg0) {}
}
