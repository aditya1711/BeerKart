package essentials;

public class User
{
  String username;
  String color;
  String budget;
  
  public User()
  {
    this.username = new String("Anonymous");
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public String getBudget()
  {
    return this.budget;
  }
  
  public String getColor()
  {
    return this.color;
  }
  
  public void setUsername(String name)
  {
    this.username = name;
  }
  
  public void setColor(String c)
  {
    this.color = c;
  }
  
  public void setBudget(String b)
  {
    this.budget = b;
  }
}
