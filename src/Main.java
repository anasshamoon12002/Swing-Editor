import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {

        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("MenuItem.acceleratorForeground", new Color(Color.GRAY.getRGB()));
            GUI g = new GUI();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }
}
