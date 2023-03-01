import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class j24chackbox  implements ActionListener
{
    JFrame jf;
    JLabel lblans;
    JCheckBox c1, c2, c3, c4;
    JButton btnans;
    JTextField txtans;
    String s = new String();


    public j24chackbox()
{
    jf = new JFrame();

        lblans = new JLabel("Answer");
        lblans.setBounds(150, 220, 100, 40);

        txtans = new JTextField(30);
        txtans.setBounds(200, 220, 250, 40);

        btnans = new JButton("Submit");
        btnans.setBounds(270, 190, 80, 30);

        c1 = new JCheckBox("Football");
        c1.setBounds(200, 100, 100, 60);

        c2 = new JCheckBox("Cricket");
        c2.setBounds(200, 150, 100, 60);

        c3 = new JCheckBox("Gaming");
        c3.setBounds(350, 100, 100, 60);

        c4 = new JCheckBox("Snooker");
        c4.setBounds(350, 150, 100, 60);


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
public static void main(String[] args)
{
    new j24chackbox();
}


@Override
public void actionPerformed(ActionEvent e){
if (e.getSource() == c1) {
    s += "Football, ";
} else if (e.getSource() == c2) {
    s += "Cricket, ";
} else if (e.getSource() == c3) {
    s += "Gaming, ";
} else if (e.getSource() == c4) {
    s += "Snooker, ";
}

if (e.getSource() == btnans) {
    txtans.setText(s);
    if (s.isEmpty()) {
        txtans.setText("Error");            
    }

}

}
}
