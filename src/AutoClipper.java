/**
 * Created by elitt on 2/21/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class AutoClipper
{
  private static int numberOfAutoClippers = 0;
  private static int effectiveness = 1;
  private static int paperclipsPerSecond = 0;
  private static double cost = 20.00;
  public static void update()
  {
    paperclipsPerSecond = numberOfAutoClippers * effectiveness;
  }
  public static void buyAutoClipper()
  {
    if(Paperclips.getMoneyAvalible() >= cost)
    {
      Paperclips.buyAutoClipper();
      numberOfAutoClippers++;
      cost = (int) (cost * 114) / 100.00;
      update();
    }
  }
  public static int getEffectiveness()
  {
    update();
    return effectiveness;
  }
  public static int getNumberOfAutoClippers()
  {
    update();
    return numberOfAutoClippers;
  }
  public static int getPaperclipsPerSecond()
  {
    update();
    return paperclipsPerSecond;
  }
  public static double getCost()
  {
    update();
    return cost;
  }
}
