package essentials;

public class Expert
{
  public String getAdvice(String Color, String Budget)
  {
    String[] beers = { "xyz", "pqr", "abc", "def" };
    int index = (int)(Math.random() * beers.length);
    return beers[index];
  }
}
