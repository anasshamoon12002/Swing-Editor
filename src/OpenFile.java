import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;

public class OpenFile implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            JFileChooser fileChooser = new JFileChooser();

            FileNameExtensionFilter filter = new FileNameExtensionFilter(null, "txt", "html", "css", "js", "xml");

            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(null);

            if(returnVal == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = fileChooser.getSelectedFile();

                GUI.textPane.read(new FileReader(selectedFile.getAbsoluteFile()), null);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
