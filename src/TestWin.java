import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TestWin
{
   public static void main(String[] args)
   {
      JFrame win = new JFrame("Win Github");
      win.setSize(700, 500);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      win.getContentPane().setBackground(Color.GREEN);

      JLabel lbl = new JLabel("ILANP on Github!");
      lbl.setFont(new Font("Arial", Font.BOLD, 50));
      lbl.setHorizontalAlignment(SwingConstants.CENTER);
      win.add(lbl);

      win.setVisible(true);
   }
}