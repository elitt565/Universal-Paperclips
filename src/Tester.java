/**
 * Created by elitt on 2/21/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
import java.util.Scanner;
public class Tester
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String action = "Nothing";
    while(!action.equals("Quit") && !action.equals("quit"))
    {
      System.out.println("AutoClipper Effectiveness: " + AutoClipper.getEffectiveness());
      System.out.println("Number of AutoClippers: " + AutoClipper.getNumberOfAutoClippers());
      System.out.println("Paperclips per second from AutoClipper: " + AutoClipper.getPaperclipsPerSecond());
      System.out.println("Cost of AutoClipper: " + AutoClipper.getCost());
      System.out.println("Paperclips Made: " + Paperclips.getPaperclipsMade());
      System.out.println("Price of Paperclips: " + Paperclips.getPrice());
      System.out.println("Public Demand of Paperclips: " + Paperclips.getPublicDemand());
      System.out.println("Paperclips Sold per second: " + Paperclips.getSoldPerSecond());
      System.out.println("Paperclips Made per second: " + Paperclips.getMadePerSecond());
      System.out.println("Money Avalible: " + Paperclips.getMoneyAvalible());
      System.out.println("Total Money Made: " + Paperclips.getTotalMoneyMade());
      System.out.println("Marketing Cost: " + Marketing.getMarketingCost());
      System.out.println("Marketing Level: " + Marketing.getMarketingLevel());
      System.out.println("-------------------------------------------------------------");
      System.out.println("What do you want to do?");
      action = sc.nextLine();
      if(action.equals("buyAutoClipper"))
      {
        AutoClipper.buyAutoClipper();
      }
      if(action.equals("increasePrice"))
      {
        Paperclips.increasePrice();
      }
      if(action.equals("decreasePrice"))
      {
        Paperclips.decreasePrice();
      }
      if(action.equals("buyAutoClipper"))
      {
        AutoClipper.buyAutoClipper();
      }
      if(action.equals("buyMarketing"))
      {
        Marketing.buyMarketing();
      }
    }
  }
}
