import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        String[][] BUTTON_TEXTS = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}};
        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                JButton btn = new JButton(BUTTON_TEXTS[i][j]);

                p1.add(btn);
            }
        }
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("The result will be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        frame.add(p2);

    }
}
class OneListenerClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
    }
}
