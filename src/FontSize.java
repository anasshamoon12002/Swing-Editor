import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSize implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String val = JOptionPane.showInputDialog(null, "Enter the font size", "12");

            if(val == null)
            {
                return;
            }

            int size = Integer.parseInt(val);

            if(size < 1)
            {
                throw new Exception();
            }

            GUI.textPane.setFont(new Font(GUI.textPane.getFont().toString(), GUI.textPane.getFont().getStyle(), size));


        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Value Must be a Positive Integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
