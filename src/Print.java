import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Print implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            GUI.textPane.print();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error while printing", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
