import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class  j25errordropdown implements ActionListener {

    JFrame jf;
    JLabel lblans, lblans2, lblpas, lblpas2;
    JButton btnans;
    JPasswordField pas, pas2;
    JTextField txtans, txtans2;
    String s = "";
    String d = "";


    public  j25errordropdown() {
        jf = new JFrame();

        lblans = new JLabel("Enter Name: ");
        lblans.setBounds(100, 60, 100, 30);

        lblans2 = new JLabel("Ans: ");
        lblans2.setBounds(130, 300, 100, 30);

        txtans2 = new JTextField(7);
        txtans2.setBounds(190, 300, 200, 30);

        txtans = new JTextField(6);
        txtans.setBounds(190, 60, 150, 30);

        lblpas = new JLabel("Enter Password: ");
        lblpas.setBounds(80, 110, 100, 30);

        pas = new JPasswordField(6);
        pas.setBounds(190, 110, 150, 30);

        lblpas2 = new JLabel("Re-enter Password: ");
        lblpas2.setBounds(60, 160, 100, 30);

        pas2 = new JPasswordField(6);
        pas2.setBounds(190, 160, 150, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(130, 220, 100, 30);

        jf.add(lblans);
        jf.add(lblans2);
        jf.add(btnans);
        jf.add(txtans);
        jf.add(txtans2);
        jf.add(lblpas);
        jf.add(pas);
        jf.add(pas2);
        jf.add(lblpas2);

        btnans.addActionListener(this);

        jf.setSize(400, 450);
        jf.setLayout(null);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new j25errordropdown();
    }

    @Override
    public void actionPerformed(ActionEvent e) {  String s = txtans.getText();
        String m = new String(pas.getPassword());
        String d = new String(pas2.getPassword());

        if (m.equals(d) && !s.isEmpty()) {
            txtans2.setText("Valid");
        }
        else 
        {
            txtans2.setText("Username or Password Invalid");
 }

    }
}
