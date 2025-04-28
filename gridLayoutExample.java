import javax.swing.*;
import java.awt.GridLayout;
public class gridLayout {
    gridLayout(){
        JFrame frame = new JFrame();
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
    new gridLayout();
    }
}
