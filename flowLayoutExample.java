import javax.swing.*;
import java.awt.FlowLayout;

public class flowLayoutExample {
    public static void main(String[] args) {
        //create a new JFrame
        JFrame frame = new JFrame("My First JFrame");

        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame on screen
        frame.setVisible(true);//make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
