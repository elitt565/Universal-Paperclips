import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by elitt on 2/25/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class MyTimerTask extends TimerTask
{
  public static void main(String[] args)
  {
    TimerTask timerTask = new MyTimerTask();
    //running timer task as daemon thread
    Timer timer = new Timer(true);
    timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
    System.out.println("TimerTask started");
    //cancel after sometime
    try {
      Thread.sleep(120000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    timer.cancel();
    System.out.println("TimerTask cancelled");
  }
  public void run()
  {
    for(int i = 0; i < Paperclips.getMadePerSecond(); i++)
    {
      Paperclips.makePaperclip();
    }
  }
}
