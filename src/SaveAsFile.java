import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveAsFile implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            JFileChooser fileChooser = new JFileChooser();

            int returnValue = fileChooser.showSaveDialog(null);

            if(returnValue == JFileChooser.APPROVE_OPTION)
            {
                File file = fileChooser.getSelectedFile();

                if(file.exists())
                {
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to overwrite the existing file", "Save", JOptionPane.YES_NO_OPTION);

                    if(option == JOptionPane.YES_OPTION)
                    {
                        GUI.textPane.write(new FileWriter(file));
                        JOptionPane.showMessageDialog(null, "File Saved");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "File Not Saved");
                    }
                }
                else
                {
                    GUI.textPane.write(new FileWriter(file));
                    JOptionPane.showMessageDialog(null, "File Saved");
                }

            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
