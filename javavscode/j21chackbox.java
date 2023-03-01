import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j21chackbox implements ActionListener 
{

    JFrame jf;
    JLabel lblans;
    JCheckBox c1, c2, c3, c4;
    JButton btnans;
    JTextField txtans;
    String s= new String();

    public j21chackbox () {

        jf = new JFrame("Checkbox Example");

        lblans = new JLabel("Answer");
        lblans.setBounds(300, 220, 100, 40);

        txtans = new JTextField(30);
        txtans.setBounds(350, 220, 500, 40);

        btnans = new JButton("Submit");
        btnans.setBounds(350, 270, 80, 20);

        c1 = new JCheckBox("Football");
        c1.setBounds(10, 200, 100, 40);

        c2 = new JCheckBox("Cricket");
        c2.setBounds(10, 250, 100, 40);

        c3 = new JCheckBox("Gaming");
        c3.setBounds(150, 200, 100, 40);

        c4 = new JCheckBox("Snooker");
        c4.setBounds(150, 250, 100, 40);

        jf.add(lblans);
        jf.add(txtans);
        jf.add(btnans);
        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.add(c4);

        btnans.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);

        jf.setSize(700, 500);
        jf.setLayout(null);
        jf.setVisible(true);

    }
   public static void main(String[] args) {
        new j21chackbox ();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == c1)
        {
            s += "Football, ";
        } 
        else if (e.getSource() == c2) 
        {
            s += "Cricket, ";
        } 
        else if (e.getSource() == c3) 
        {
            s += "Gaming, ";
        } 
        else if (e.getSource() == c4) 
        {
            s += "Snooker, ";
        }
        if (e.getSource() == btnans)
        {
            txtans.setText(s);
        }
    }
}