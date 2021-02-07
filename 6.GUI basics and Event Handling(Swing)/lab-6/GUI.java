import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class GUI extends JFrame {
    public static void main(String[] args) {
        //GridLayout frame = new GridLayout();

        JFrame frame=new JFrame();

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Printer");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,230);
        JLabel label =new JLabel("Printer: MyPrinter");
        JLabel label1 =new JLabel("Print Quality:");
        label1.setBounds(50,100,200,90);
        label.setBounds(20,10,150,70);
        JPanel panel=new JPanel();
        panel.setBorder(new LineBorder(Color.white,200));
        panel.setBounds(20,65,70,65);
        JCheckBox checkBox1=new JCheckBox("Image");
        JCheckBox checkBox2=new JCheckBox("Text");
        JCheckBox checkBox3=new JCheckBox("Code");
        JCheckBox checkBox4=new JCheckBox("Print to the File");
        checkBox1.setBounds(89,60,60,25);
        checkBox2.setBounds(89,85,60,25);
        checkBox3.setBounds(89,110,60,25);
        checkBox4.setBounds(195,130,130,50);
        JPanel panel1=new JPanel();
        panel1.setBorder(new LineBorder(Color.white,200));
        panel1.setBounds(100,65,70,65);
        JRadioButton bottom1=new JRadioButton("Selection");
        bottom1.setBounds(175,60,80,25);
        JRadioButton bottom2=new JRadioButton("All");
        bottom2.setBounds(175,85,80,25);
        JRadioButton bottom3=new JRadioButton("Applet");
        bottom3.setBounds(175,110,80,25);
        JPanel panel2=new JPanel();
        panel2.setBorder(new LineBorder(Color.white,200));
        panel2.setBounds(250,65,70,65);
        JButton button=new JButton("OK");
        JButton button1=new JButton("Cancel");
        JButton button2=new JButton("Setup...");
        JButton button3=new JButton("Help");
        button.setBounds(350,20,80,30);
        button1.setBounds(350,60,80,30);
        button2.setBounds(350,100,80,30);
        button3.setBounds(350,140,80,30);
        String s[]={"High","Low"};
        JComboBox comboBox=new JComboBox(s);
        comboBox.setBounds(130,135,50,30);

        frame.add(label);
        frame.add(panel);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(panel1);
        frame.add(bottom1);
        frame.add(bottom2);
        frame.add(bottom3);
        frame.add(panel2);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(comboBox);
        frame.add(label1);
        frame.add(checkBox4);
    }
}



/*FAyyoz Naimov
U1910071
 */

