import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontFamily implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(GUI.radioButtons[0].isSelected())
        {
            GUI.textPane.setFont(new Font("Arial", GUI.textPane.getFont().getStyle(), GUI.textPane.getFont().getSize()));
        }

        if(GUI.radioButtons[1].isSelected())
        {
            GUI.textPane.setFont(new Font("Calibri", GUI.textPane.getFont().getStyle(), GUI.textPane.getFont().getSize()));
        }

        if(GUI.radioButtons[2].isSelected())
        {
            GUI.textPane.setFont(new Font("Monospaced", GUI.textPane.getFont().getStyle(), GUI.textPane.getFont().getSize()));
        }

        if(GUI.radioButtons[3].isSelected())
        {
            GUI.textPane.setFont(new Font("Serif", GUI.textPane.getFont().getStyle(), GUI.textPane.getFont().getSize()));
        }

        if(GUI.radioButtons[4].isSelected())
        {
            GUI.textPane.setFont(new Font("Times New Roman", GUI.textPane.getFont().getStyle(), GUI.textPane.getFont().getSize()));
        }

    }
}
