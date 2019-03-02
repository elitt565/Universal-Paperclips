/**
 * Created by elitt on 2/21/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class Paperclips
{
  private static int paperclipsMade = 0;
  private static double price = 8.00;
  private static int publicDemand = 100;
  private static int maxSoldPerSecond = 0;
  private static int soldPerSecond = 0;
  private static int madePerSecond = 0;
  private static double moneyAvalible = 200.00;
  private static double totalMoneyMade = 0;
  private static boolean mindControl = false;
  public static void update()
  {
    calculatePublicDemand();
    madePerSecond = AutoClipper.getPaperclipsPerSecond();
    if(maxSoldPerSecond > madePerSecond)
    {
      soldPerSecond = madePerSecond;
    }
    else
    {
      soldPerSecond = maxSoldPerSecond;
    }
  }
  public static void buyAutoClipper()
  {
    if(moneyAvalible >= AutoClipper.getCost())
    {
      madePerSecond += AutoClipper.getEffectiveness();
      moneyAvalible -= AutoClipper.getCost();
    }
    update();
  }
  public static void buyMarketing()
  {
    if(moneyAvalible >= Marketing.getMarketingCost())
    {
      moneyAvalible -= Marketing.getMarketingCost();
    }
    update();
  }
  public static void calculatePublicDemand()
  {
    if(!mindControl)
    {
      publicDemand = (int) (((8 * Marketing.getMarketingLevel()) / price) * 100);
      maxSoldPerSecond = publicDemand / 5;
    }
    else
    {
      publicDemand = (int) (((8000000 * Marketing.getMarketingLevel()) / price) * 100);
      maxSoldPerSecond = publicDemand / 5;
    }
  }
  public static void increasePrice()
  {
    price++;
  }
  public static void decreasePrice()
  {
    if(price > 1)
    {
      price--;
    }
  }
  public static void makePaperclip()
  {
    paperclipsMade++;
  }
  public static int getPaperclipsMade()
  {
    update();
    return paperclipsMade;
  }
  public static double getPrice()
  {
    update();
    return price;
  }
  public static int getPublicDemand()
  {
    update();
    return publicDemand;
  }
  public static int getSoldPerSecond()
  {
    update();
    return soldPerSecond;
  }
  public static int getMadePerSecond()
  {
    update();
    return madePerSecond;
  }
  public static double getMoneyAvalible()
  {
    update();
    return moneyAvalible;
  }
  public static double getTotalMoneyMade()
  {
    update();
    return totalMoneyMade;
  }
}
