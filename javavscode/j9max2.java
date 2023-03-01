import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class j9max2 implements ActionListener {

    JFrame jf1;
    JLabel lblno1,lblno2,lblans;
    JButton btnans;
    JTextField txtno1,txtno2,txtans;
    
    public j9max2(){
        jf1=new JFrame();

        lblno1=new JLabel("no1");
        lblno1.setBounds(100,100, 100,30);

        lblno2 = new JLabel("No 2");
        lblno2.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Maximum No.");
        lblans.setBounds(100, 250, 100, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(100, 200, 100, 40);

        txtno1 = new JTextField(5);
        txtno1.setBounds(200, 100, 100, 30);

        txtno2 = new JTextField(5);
        txtno2.setBounds(200, 150, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 250, 100, 30);

        jf1.add(lblno1);
        jf1.add(lblno2);
        jf1.add(txtno1);
        jf1.add(txtno2);
        jf1.add(btnans);
        jf1.add(lblans);
        jf1.add(txtans);
    

        btnans.addActionListener(this);

        jf1.setSize(700, 500);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
    public static void main(String[] args) {
        new j9max2();
 

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double no1 = Double.parseDouble(txtno1.getText());
        double no2 = Double.parseDouble(txtno2.getText());

        if (no1 > no2) {
            txtans.setText(no1 + " is Greater");
        } else {
            txtans.setText(no2 + " is Greater");}

       
    }

    
}
