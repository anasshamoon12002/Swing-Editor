import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontStyle implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(GUI.bold.isSelected() && !GUI.italics.isSelected())
            {
                GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), Font.BOLD, GUI.textPane.getFont().getSize()));
            }
            else if(!GUI.bold.isSelected() && GUI.italics.isSelected())
            {
                GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), Font.ITALIC, GUI.textPane.getFont().getSize()));
            }
            else if(GUI.bold.isSelected() && GUI.italics.isSelected())
            {
                GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), Font.ITALIC + Font.BOLD, GUI.textPane.getFont().getSize()));
            }
            else
            {
                GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), Font.PLAIN, GUI.textPane.getFont().getSize()));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
