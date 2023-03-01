import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j10studentsubject implements ActionListener 
{

    JFrame jf;
    JLabel lbleng, lblhin, lblfre, lblans, lblgrade;
    JButton btnans;
    JTextField txteng, txthin, txtfre, txtans, txtgrade;

    public j10studentsubject() 
    {

        jf = new JFrame();

        lbleng = new JLabel("English Marks");
        lbleng.setBounds(100, 50, 100, 30);

        lblhin = new JLabel("Hindi Marks");
        lblhin.setBounds(100, 100, 100, 30);

        lblfre = new JLabel("French Marks");
        lblfre.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Grade");
        lblans.setBounds(100, 250, 100, 30);

        lblgrade = new JLabel("Result");
        lblgrade.setBounds(100, 200, 100, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(100, 300, 100, 40);

        txteng = new JTextField(5);
        txteng.setBounds(200, 50, 100, 30);

        txthin = new JTextField(5);
        txthin.setBounds(200, 100, 100, 30);

        txtfre = new JTextField(5);
        txtfre.setBounds(200, 150, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 250, 100, 30);

        txtgrade = new JTextField(5);
        txtgrade.setBounds(200, 200, 100, 30);

        jf.add(lbleng);
        jf.add(lblhin);
        jf.add(lblfre);
        jf.add(lblgrade);
        jf.add(lblans);
        jf.add(btnans);
        jf.add(txteng);
        jf.add(txthin);
        jf.add(txtfre);
        jf.add(txtans);
        jf.add(txtgrade);

        btnans.addActionListener(this);

        jf.setSize(700, 500);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new j10studentsubject();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        double eng = Double.parseDouble(txteng.getText());
        double hin = Double.parseDouble(txthin.getText());
        double fre = Double.parseDouble(txtfre.getText());
         double total = eng + hin + fre;
        txtgrade.setText(total+""); 

            if (total < 32) 
            {
                txtans.setText("Grade C");
            } else if (total < 72) 
            {
                txtans.setText("Grade B");
            } else 
            {
                txtans.setText("Grade A");}
    }

}