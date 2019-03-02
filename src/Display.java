import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by elitt on 2/23/2019.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class Display extends TimerTask
{
  private JButton makePaperclip;
  private JPanel window;
  private JButton buyWireButton;
  private JPanel paperclipInfo;
  private JLabel totalPaperclipsVariable;
  private JButton buyAutoClipper;
  private JLabel numOfAutoClippers;

  public Display()
  {
    makePaperclip.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Paperclips.makePaperclip();
        update();
      }
    });
    buyWireButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        JOptionPane.showMessageDialog(null, "Wire bought");
      }
    });
    update();
    buyAutoClipper.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        AutoClipper.buyAutoClipper();
        update();
      }
    });
  }
  public void update()
  {
    totalPaperclipsVariable.setText(String.valueOf(Paperclips.getPaperclipsMade()));
    numOfAutoClippers.setText(String.valueOf(AutoClipper.getNumberOfAutoClippers()));
    System.out.println("Should be updated");
  }
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Display");
    Display content = new Display();
    frame.setContentPane(content.window);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    TimerTask timerTask1 = new MyTimerTask();
    TimerTask timerTask2 = content;
    java.util.Timer timer = new Timer();
    timer.scheduleAtFixedRate(timerTask1, 0, 1000);
    timer.scheduleAtFixedRate(timerTask2, 0, 1000);
    System.out.println("TimerTask started");
  }
  public void run()
  {
    update();
  }
}
