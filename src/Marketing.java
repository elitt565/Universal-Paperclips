/**
 * Created by elitt on 2/21/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class Marketing
{
  private static int marketingLevel = 1;
  private static double marketingCost = 100.00;
  public static int getMarketingLevel()
  {
    return marketingLevel;
  }
  public static double getMarketingCost()
  {
    return marketingCost;
  }
  public static void buyMarketing()
  {
    if(Paperclips.getMoneyAvalible() >= marketingCost)
    {
      Paperclips.buyMarketing();
      marketingLevel++;
      marketingCost += marketingLevel * 50.00;
    }
  }
}
