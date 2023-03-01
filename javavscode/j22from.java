import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j22from implements ActionListener {

    JFrame jf;
    JLabel lblans, lblans2;
    JButton btnans;
    JTextField txtans, txtans2;
    String s = "";


    public j22from() {
        jf = new JFrame("Checkbox Example");

        lblans = new JLabel("Enter Name: ");
        lblans.setBounds(100, 100, 100, 40);

        lblans2 = new JLabel("Name: ");
        lblans2.setBounds(130, 195, 100, 40);

        txtans = new JTextField(5);
        txtans.setBounds(190, 100, 100, 30);

        txtans2 = new JTextField(5);
        txtans2.setBounds(190, 200, 100, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(100, 150, 90, 30);

        jf.add(lblans);
        jf.add(lblans2);
        jf.add(btnans);
        jf.add(txtans);
        jf.add(txtans2);

        btnans.addActionListener(this);

        jf.setSize(400, 450);
        jf.setLayout(null);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        new j22from();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==
        btnans) 
        {
            String s = txtans.getText();
            if (!s.isEmpty())
            {
                txtans2.setText(s);
            } 
            else 
            {
                txtans2.setText("Pleas Enter Name");
            }
        }
        
    }
}

