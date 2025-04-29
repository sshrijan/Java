import javax.swing.JFrame;
import javax.swing.JLabel;

public class jframe {
    public static void main(String[] args) {
        //create a new JFrame
        JFrame frame = new JFrame("My First JFrame");
        //create label
        JLabel label = new JLabel("Bca Third Semester Group");

        //add the label to the frame
        frame.add(label);
        //set frame properties
        frame.setSize(800,500); //set the size of the frame
        //close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make the frame visible
        frame.setVisible(true);
    }
}
