import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class j23pass implements ActionListener {

    JFrame jf;
    JLabel lblname, lblans, lblans2, lbl3;
    JButton btnans;
    JTextField txtname, txtans;
    JPasswordField pass1, pass2;
    

    public j23pass() {
        jf = new JFrame("Password Example");

        lblname = new JLabel("Enter Name:");
        lblname.setBounds(50, 50, 100, 30);

        lblans = new JLabel("Enter Password:");
        lblans.setBounds(50, 100, 100, 30);

        lblans2 = new JLabel("ReenterPassword:");
        lblans2.setBounds(50, 150, 120, 30);

        lbl3 = new JLabel("Ans:");
        lbl3.setBounds(50, 200, 100, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(150, 250, 100, 30);

        txtname = new JTextField();
        txtname.setBounds(150, 50, 150, 30);

        txtans = new JTextField();
        txtans.setBounds(150, 200, 150, 30);
        txtans.setEditable(false);

        pass1 = new JPasswordField();
        pass1.setBounds(150, 100, 150, 30);

        pass2 = new JPasswordField();
        pass2.setBounds(150, 150, 150, 30);

        jf.add(lblname);
        jf.add(lblans);
        jf.add(lblans2);
        jf.add(lbl3);
        jf.add(btnans);
        jf.add(txtname);
        jf.add(txtans);
        jf.add(pass1);
        jf.add(pass2);

        btnans.addActionListener(this);

        jf.setSize(400, 350);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new j23pass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnans)
        {
            String m = new String(pass1.getPassword());
            String s = new String(pass2.getPassword());

            if(m.equals(s))
            {
                txtans.setText("Match the Password");
            }
            else
            {
                txtans.setText("Passwords don't match!");
            }
        }
        
    }
}
