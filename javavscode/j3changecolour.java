import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class j3changecolour implements ActionListener {

    JFrame f;
    JButton b1, b2, b3;

    j3changecolour() {
        f = new JFrame(); // creating instance of JFrame

        b1 = new JButton("Red"); // creating instance of JButton
        b1.setBounds(100, 100, 100, 30);

        b2 = new JButton("Yellow"); // creating instance of JButton
        b2.setBounds(300, 100, 100, 30);

        b3 = new JButton("Green"); // creating instance of JButton
        b3.setBounds(500, 100, 100, 30);

        f.add(b1); // adding button in JFrame
        f.add(b2);
        f.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f.setSize(700, 500); // 400 width and 500 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible
    }

    public static void main(String[] args) {
        new j3changecolour();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == b2) {
            f.getContentPane().setBackground(Color.YELLOW);
        } else if (e.getSource() == b3) {
            f.getContentPane().setBackground(Color.GREEN);
        }
    }
}
