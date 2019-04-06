import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextColor implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Color textColor = JColorChooser.showDialog(null, "Choose a Color", Color.BLACK);

        GUI.textPane.setForeground(textColor);
    }
}
