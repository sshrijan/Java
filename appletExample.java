import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appletExample {
    public static void main(String[] args) {
        //create the frame
        JFrame frame = new JFrame();
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        //create components
        JLabel lbl1 = new JLabel("First Number");
        JTextField txt1 = new JTextField(5);

        JLabel lbl2 = new JLabel("Second Number");
        JTextField txt2 = new JTextField(5);

        JLabel lbl3 = new JLabel("Result : ");
        JButton btn = new JButton("Submit");

        //Add components to frame
        frame.add(lbl1);
        frame.add(txt1);
        frame.add(lbl2);
        frame.add(txt2);
        frame.add(lbl3);
        frame.add(btn);

        //Button Action
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int first = Integer.parseInt(txt1.getText());
                    int second = Integer.parseInt(txt2.getText());
                    int result = first + second;
                    lbl3.setText("Result : "+ result);
                }catch (NumberFormatException ex){
                    lbl3.setText("Invalid Input");
                }
            }
        });

        //close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}