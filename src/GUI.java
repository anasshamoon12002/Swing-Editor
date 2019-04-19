
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
    static JMenuItem newFile, openFile, saveFile, saveAsFile, exit, color, fontSize;
    static JCheckBoxMenuItem bold, italics;
    static JRadioButtonMenuItem[] radioButtons;
    static ButtonGroup radioGroup;

    int[] sizeArr = {10, 12, 14, 16};

    public GUI()
    {

        textPane = new JTextPane();
        textPane.setFont(new Font("Arial", textPane.getFont().getStyle(), 14));

        editor = new JScrollPane(textPane);

        menuBar = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");

        newFile = new JMenuItem("New");
        newFile.setIcon(resizedImageIcon("Icons/NewFile.png"));
        newFile.setIconTextGap(10);
        newFile.addActionListener(new NewFile());

        openFile = new JMenuItem("Open");
        openFile.setIcon(resizedImageIcon("Icons/OpenFile.png"));
        openFile.setIconTextGap(10);
        openFile.addActionListener(new OpenFile());

        saveFile = new JMenuItem("Save");
        saveFile.setIcon(resizedImageIcon("Icons/Save.png"));
        saveFile.setIconTextGap(10);
        saveFile.addActionListener(new SaveFile());

        saveAsFile = new JMenuItem("Save As");
        saveAsFile.setIcon(resizedImageIcon("Icons/SaveAs.png"));
        saveAsFile.setIconTextGap(10);
        saveAsFile.addActionListener(new SaveAsFile());

        exit = new JMenuItem("Exit");
        exit.setIcon(resizedImageIcon("Icons/Exit.png"));
        exit.setIconTextGap(10);
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
        file.add(saveAsFile);
        file.addSeparator();
        file.add(exit);

        edit.add(fontStyle);
        edit.add(fontFamily);
        edit.add(fontSize);
        edit.add(color);

        menuBar.add(file);
        menuBar.add(edit);

        setJMenuBar(menuBar);
        add(editor);

        setIconImage(new ImageIcon(getClass().getResource("Icons/FrameIcon.png")).getImage());
        setTitle("Swing Editor");
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


    private ImageIcon resizedImageIcon(String imagePath)
    {

        Image image = new ImageIcon(getClass().getResource(imagePath)).getImage();

        image = image.getScaledInstance(17, 18, Image.SCALE_SMOOTH);

        ImageIcon icon = new ImageIcon(image);

        return icon;
    }


}
