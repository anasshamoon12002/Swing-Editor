import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSize implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int val = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the font size", "12"));

        GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), GUI.textPane.getFont().getStyle(), val));
    }
}
