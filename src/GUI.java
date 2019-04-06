import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener
{
    private String[] fontList = {"Arial", "Calibri", "Monospaced", "Serif", "Times New Roman"};

    static JTextPane textPane;
    static JScrollPane editor;
    static JMenuBar menuBar;
    static JMenu file, edit, fontStyle, fontFamily;
    static JMenuItem newFile, openFile, saveFile, exit, color, fontSize;
    static JCheckBoxMenuItem bold, italics;
    static JRadioButtonMenuItem[] radioButtons;
    static ButtonGroup radioGroup;

    int[] sizeArr = {10, 12, 14, 16};

    public GUI()
    {

        textPane = new JTextPane();
        textPane.setFont(new Font("Arial", textPane.getFont().getStyle(), 12));

        editor = new JScrollPane(textPane);

        menuBar = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");

        newFile = new JMenuItem("New");
        newFile.addActionListener(new NewFile());

        openFile = new JMenuItem("Open");
        openFile.addActionListener(new OpenFile());

        saveFile = new JMenuItem("Save");
        saveFile.addActionListener(new SaveFile());

        exit = new JMenuItem("Close");
        exit.addActionListener(this);

        fontStyle = new JMenu("Font Style");

        fontFamily = new JMenu("Font Family");

        color = new JMenuItem("Color");
        color.addActionListener(new TextColor());


        bold = new JCheckBoxMenuItem("Bold");
        bold.addActionListener(new FontStyle());

        italics = new JCheckBoxMenuItem("Italics");
        italics.addActionListener(new FontStyle());


        radioButtons = new JRadioButtonMenuItem[5];

        radioGroup = new ButtonGroup();

        for(int i = 0; i < radioButtons.length; i++)
        {
            radioButtons[i] = new JRadioButtonMenuItem(fontList[i]);
            radioButtons[i].addActionListener(new FontFamily());
            radioGroup.add(radioButtons[i]);
            fontFamily.add(radioButtons[i]);

        }

        radioButtons[0].setSelected(true);

        fontSize = new JMenuItem("Font Size");
        fontSize.addActionListener(new FontSize());


        fontStyle.add(bold);
        fontStyle.add(italics);

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(exit);

        edit.add(fontStyle);
        edit.add(fontFamily);
        edit.add(fontSize);
        edit.add(color);

        menuBar.add(file);
        menuBar.add(edit);

        setJMenuBar(menuBar);
        add(editor);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( 750, 550);
        setLocationRelativeTo(null);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }


}
